import React from 'react';
import {createRoot} from 'react-dom/client';

import {worker} from './mocks/server';

import './styles/index.css';

import './styles/components.css';

import {TooltipProvider} from '@/components/ui/tooltip';
import {getRouter as getEmbeddedRouter} from '@/embeddedWorkflowBuilderRoutes';
import {ThemeProvider} from '@/shared/providers/theme-provider';
import {QueryClient, QueryClientProvider} from '@tanstack/react-query';
import {ReactQueryDevtools} from '@tanstack/react-query-devtools';
import EditorWorker from 'monaco-editor/esm/vs/editor/editor.worker?worker';
import JsonWorker from 'monaco-editor/esm/vs/language/json/json.worker?worker';
import TsWorker from 'monaco-editor/esm/vs/language/typescript/ts.worker?worker';
import YamlWorker from 'monaco-yaml/yaml.worker?worker';
import posthog from 'posthog-js';
import {PostHogProvider} from 'posthog-js/react';
import {RouterProvider} from 'react-router-dom';

import {getRouter as getMainRouter} from './routes';

window.MonacoEnvironment = {
    getWorker(moduleId: string, label: string) {
        switch (label) {
            case 'editorWorkerService':
                return new EditorWorker();
            case 'javascript':
                return new TsWorker();
            case 'json':
                return new JsonWorker();
            case 'yaml':
                return new YamlWorker();
            default:
                throw new Error(`Unknown label ${label} for moduleId ${moduleId}`);
        }
    },
};

if (process.env.NODE_ENV === 'mock') {
    worker.start().then(() => renderApp());
} else {
    renderApp();
}

function renderApp() {
    const container = document.getElementById('root') as HTMLDivElement;
    const root = createRoot(container);
    const queryClient = new QueryClient();

    const isEmbeddedWorkflowBuilder = window.location.pathname.includes('/embedded/workflow-builder');

    const router = isEmbeddedWorkflowBuilder ? getEmbeddedRouter() : getMainRouter(queryClient);

    root.render(
        <React.StrictMode>
            <ThemeProvider defaultTheme="light">
                <QueryClientProvider client={queryClient}>
                    <PostHogProvider client={posthog}>
                        <TooltipProvider>
                            <RouterProvider router={router} />
                        </TooltipProvider>
                    </PostHogProvider>

                    <ReactQueryDevtools buttonPosition="bottom-right" initialIsOpen={false} />
                </QueryClientProvider>
            </ThemeProvider>
        </React.StrictMode>
    );
}
