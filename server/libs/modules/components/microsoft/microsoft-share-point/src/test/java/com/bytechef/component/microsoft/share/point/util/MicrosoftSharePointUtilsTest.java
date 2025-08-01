/*
 * Copyright 2025 ByteChef
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bytechef.component.microsoft.share.point.util;

import static com.bytechef.component.definition.ComponentDsl.bool;
import static com.bytechef.component.definition.ComponentDsl.date;
import static com.bytechef.component.definition.ComponentDsl.dateTime;
import static com.bytechef.component.definition.ComponentDsl.number;
import static com.bytechef.component.definition.ComponentDsl.option;
import static com.bytechef.component.definition.ComponentDsl.string;
import static com.bytechef.component.microsoft.share.point.constant.ColumnType.BOOLEAN;
import static com.bytechef.component.microsoft.share.point.constant.ColumnType.CHOICE;
import static com.bytechef.component.microsoft.share.point.constant.ColumnType.DATE_TIME;
import static com.bytechef.component.microsoft.share.point.constant.ColumnType.NUMBER;
import static com.bytechef.component.microsoft.share.point.constant.ColumnType.TEXT;
import static com.bytechef.component.microsoft.share.point.constant.MicrosoftSharePointConstants.DESCRIPTION;
import static com.bytechef.component.microsoft.share.point.constant.MicrosoftSharePointConstants.DISPLAY_NAME;
import static com.bytechef.component.microsoft.share.point.constant.MicrosoftSharePointConstants.ID;
import static com.bytechef.component.microsoft.share.point.constant.MicrosoftSharePointConstants.NAME;
import static com.bytechef.component.microsoft.share.point.constant.MicrosoftSharePointConstants.PARENT_FOLDER;
import static com.bytechef.component.microsoft.share.point.constant.MicrosoftSharePointConstants.READ_ONLY;
import static com.bytechef.component.microsoft.share.point.constant.MicrosoftSharePointConstants.REQUIRED;
import static com.bytechef.component.microsoft.share.point.constant.MicrosoftSharePointConstants.VALUE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.bytechef.component.definition.ActionContext;
import com.bytechef.component.definition.Context.Http;
import com.bytechef.component.definition.Option;
import com.bytechef.component.definition.Parameters;
import com.bytechef.component.definition.Property;
import com.bytechef.component.definition.TypeReference;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

/**
 * @author Monika Domiter
 */
class MicrosoftSharePointUtilsTest {

    private final ActionContext mockedContext = mock(ActionContext.class);
    private final Http.Executor mockedExecutor = mock(Http.Executor.class);
    private final Parameters mockedParameters = mock(Parameters.class);
    private final Http.Response mockedResponse = mock(Http.Response.class);
    private final ArgumentCaptor<String> stringArgumentCaptor = ArgumentCaptor.forClass(String.class);

    @Test
    void testCreatePropertiesForListItem() {
        Map<String, List<Map<String, Object>>> map = new LinkedHashMap<>();
        List<Map<String, Object>> columns = new ArrayList<>();
        Map<String, Object> boolMap = new LinkedHashMap<>();

        boolMap.put(NAME, NAME);
        boolMap.put(DISPLAY_NAME, DISPLAY_NAME);
        boolMap.put(DESCRIPTION, DESCRIPTION);
        boolMap.put(REQUIRED, false);

        boolMap.put(READ_ONLY, false);
        boolMap.put(BOOLEAN.toString(), new LinkedHashMap<>());

        columns.add(boolMap);

        Map<String, Object> choiceMap = new LinkedHashMap<>();

        choiceMap.put(NAME, NAME);
        choiceMap.put(DISPLAY_NAME, DISPLAY_NAME);
        choiceMap.put(DESCRIPTION, DESCRIPTION);
        choiceMap.put(REQUIRED, true);
        choiceMap.put(CHOICE.toString(), Map.of("choices", List.of("choice1", "choice2")));

        choiceMap.put(READ_ONLY, false);

        columns.add(choiceMap);

        Map<String, Object> numberMap = new LinkedHashMap<>();

        numberMap.put(NAME, NAME);
        numberMap.put(DISPLAY_NAME, DISPLAY_NAME);
        numberMap.put(DESCRIPTION, DESCRIPTION);
        numberMap.put(REQUIRED, false);
        numberMap.put(NUMBER.toString(), new LinkedHashMap<>());

        numberMap.put(READ_ONLY, false);

        columns.add(numberMap);

        Map<String, Object> dateMap = new LinkedHashMap<>();

        dateMap.put(NAME, NAME);
        dateMap.put(DISPLAY_NAME, DISPLAY_NAME);
        dateMap.put(DESCRIPTION, DESCRIPTION);
        dateMap.put(REQUIRED, false);
        dateMap.put(DATE_TIME.toString(), Map.of("format", "dateOnly"));

        dateMap.put(READ_ONLY, false);

        columns.add(dateMap);

        Map<String, Object> dateTimeMap = new LinkedHashMap<>();

        dateTimeMap.put(NAME, NAME);
        dateTimeMap.put(DISPLAY_NAME, DISPLAY_NAME);
        dateTimeMap.put(DESCRIPTION, DESCRIPTION);
        dateTimeMap.put(REQUIRED, false);
        dateTimeMap.put(DATE_TIME.toString(), Map.of());

        dateTimeMap.put(READ_ONLY, false);

        columns.add(dateTimeMap);

        Map<String, Object> textMap = new LinkedHashMap<>();

        textMap.put(NAME, NAME);
        textMap.put(DISPLAY_NAME, DISPLAY_NAME);
        textMap.put(DESCRIPTION, DESCRIPTION);
        textMap.put(REQUIRED, false);
        textMap.put(TEXT.toString(), Map.of("allowMultipleLines", true));

        textMap.put(READ_ONLY, false);

        columns.add(textMap);

        Map<String, Object> stringMap = new LinkedHashMap<>();

        stringMap.put(NAME, NAME);
        stringMap.put(DISPLAY_NAME, DISPLAY_NAME);
        stringMap.put(DESCRIPTION, DESCRIPTION);
        stringMap.put(REQUIRED, true);
        stringMap.put(TEXT.toString(), Map.of("allowMultipleLines", false, "maxLength", 255));

        stringMap.put(READ_ONLY, false);

        columns.add(stringMap);

        map.put(VALUE, columns);

        when(mockedContext.http(any()))
            .thenReturn(mockedExecutor);
        when(mockedExecutor.configuration(any()))
            .thenReturn(mockedExecutor);
        when(mockedExecutor.execute())
            .thenReturn(mockedResponse);
        when(mockedResponse.getBody(any(TypeReference.class)))
            .thenReturn(map);

        List<Property.ValueProperty<?>> expectedProperties = List.of(
            bool(NAME)
                .label(DISPLAY_NAME)
                .description(DESCRIPTION)
                .required(false),
            string(NAME)
                .label(DISPLAY_NAME)
                .description(DESCRIPTION)
                .options(
                    option("choice1", "choice1"),
                    option("choice2", "choice2"))
                .required(true),
            number(NAME)
                .label(DISPLAY_NAME)
                .description(DESCRIPTION)
                .required(false),
            date(NAME)
                .label(DISPLAY_NAME)
                .description(DESCRIPTION)
                .required(false),
            dateTime(NAME)
                .label(DISPLAY_NAME)
                .description(DESCRIPTION)
                .required(false),
            string(NAME)
                .label(DISPLAY_NAME)
                .description(DESCRIPTION)
                .controlType(Property.ControlType.TEXT_AREA)
                .required(false),
            string(NAME)
                .label(DISPLAY_NAME)
                .description(DESCRIPTION)
                .maxLength(255)
                .required(true));

        assertEquals(expectedProperties,
            MicrosoftSharePointUtils.createPropertiesForListItem(mockedParameters, mockedParameters, Map.of(),
                mockedContext));
    }

    @Test
    void testGetListIdOptions() {
        when(mockedContext.http(any()))
            .thenReturn(mockedExecutor);
        when(mockedExecutor.configuration(any()))
            .thenReturn(mockedExecutor);
        when(mockedExecutor.execute())
            .thenReturn(mockedResponse);
        when(mockedResponse.getBody(any(TypeReference.class)))
            .thenReturn(Map.of(VALUE, List.of(Map.of(DISPLAY_NAME, "list", ID, "listId"))));

        List<Option<String>> expectedOptions = new ArrayList<>();

        expectedOptions.add(option("list", "listId"));

        assertEquals(
            expectedOptions,
            MicrosoftSharePointUtils.getListIdOptions(mockedParameters, mockedParameters, Map.of(), "", mockedContext));
    }

    @Test
    void testGetFolderId() {
        when(mockedParameters.getString(PARENT_FOLDER))
            .thenReturn(ID);

        assertEquals(ID, MicrosoftSharePointUtils.getFolderId(mockedParameters));

        when(mockedParameters.getString(PARENT_FOLDER))
            .thenReturn(null);

        assertEquals("root", MicrosoftSharePointUtils.getFolderId(mockedParameters));
    }

    @Test
    void testGetFolderIdOptions() {
        when(mockedContext.http(any()))
            .thenReturn(mockedExecutor);
        when(mockedExecutor.queryParameter(stringArgumentCaptor.capture(), stringArgumentCaptor.capture()))
            .thenReturn(mockedExecutor);
        when(mockedExecutor.configuration(any()))
            .thenReturn(mockedExecutor);
        when(mockedExecutor.execute())
            .thenReturn(mockedResponse);
        when(mockedResponse.getBody(any(TypeReference.class)))
            .thenReturn(Map.of(VALUE, List.of(Map.of(NAME, "folderName", ID, "folderId"))));

        List<Option<String>> expectedOptions = new ArrayList<>();

        expectedOptions.add(option("folderName", "folderId"));

        List<Option<String>> folderIdOptions = MicrosoftSharePointUtils.getFolderIdOptions(
            mockedParameters, mockedParameters, Map.of(), "", mockedContext);

        assertEquals(expectedOptions, folderIdOptions);
        assertEquals(
            List.of("$filter", URLEncoder.encode("folder ne null", StandardCharsets.UTF_8)),
            stringArgumentCaptor.getAllValues());
    }

    @Test
    void testGetSiteOptions() {
        when(mockedContext.http(any()))
            .thenReturn(mockedExecutor);
        when(mockedExecutor.queryParameter(stringArgumentCaptor.capture(), stringArgumentCaptor.capture()))
            .thenReturn(mockedExecutor);
        when(mockedExecutor.configuration(any()))
            .thenReturn(mockedExecutor);
        when(mockedExecutor.execute())
            .thenReturn(mockedResponse);
        when(mockedResponse.getBody(any(TypeReference.class)))
            .thenReturn(Map.of(VALUE, List.of(Map.of(NAME, "site", ID, "siteId"))));

        List<Option<String>> expectedOptions = new ArrayList<>();

        expectedOptions.add(option("site", "siteId"));

        List<Option<String>> siteOptions = MicrosoftSharePointUtils.getSiteOptions(
            mockedParameters, mockedParameters, Map.of(), "", mockedContext);

        assertEquals(expectedOptions, siteOptions);
        assertEquals(List.of("search", "*&select=displayName,id,name"), stringArgumentCaptor.getAllValues());
    }
}
