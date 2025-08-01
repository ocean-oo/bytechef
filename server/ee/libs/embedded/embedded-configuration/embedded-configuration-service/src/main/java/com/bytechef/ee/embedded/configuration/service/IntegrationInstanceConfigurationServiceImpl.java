/*
 * Copyright 2025 ByteChef
 *
 * Licensed under the ByteChef Enterprise license (the "Enterprise License");
 * you may not use this file except in compliance with the Enterprise License.
 */

package com.bytechef.ee.embedded.configuration.service;

import com.bytechef.commons.util.OptionalUtils;
import com.bytechef.ee.embedded.configuration.domain.IntegrationInstanceConfiguration;
import com.bytechef.ee.embedded.configuration.repository.IntegrationInstanceConfigurationRepository;
import com.bytechef.platform.constant.Environment;
import java.util.List;
import org.apache.commons.lang3.Validate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * @version ee
 *
 * @author Ivica Cardic
 */
@Service
@Transactional
public class IntegrationInstanceConfigurationServiceImpl implements IntegrationInstanceConfigurationService {

    private final IntegrationInstanceConfigurationRepository integrationInstanceConfigurationRepository;

    public IntegrationInstanceConfigurationServiceImpl(
        IntegrationInstanceConfigurationRepository integrationInstanceConfigurationRepository) {

        this.integrationInstanceConfigurationRepository = integrationInstanceConfigurationRepository;
    }

    @Override
    public IntegrationInstanceConfiguration create(IntegrationInstanceConfiguration integrationInstanceConfiguration) {
        Assert.notNull(integrationInstanceConfiguration, "'integrationInstance' must not be null");
        Assert.isTrue(integrationInstanceConfiguration.getId() == null, "'id' must be null");
        Assert.notNull(integrationInstanceConfiguration.getIntegrationId(), "'integrationId' must not be null");

        integrationInstanceConfiguration.setEnabled(false);

        return integrationInstanceConfigurationRepository.save(integrationInstanceConfiguration);
    }

    @Override
    public void delete(long id) {
        integrationInstanceConfigurationRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public IntegrationInstanceConfiguration getIntegrationInstanceConfiguration(long id) {
        return OptionalUtils.get(integrationInstanceConfigurationRepository.findById(id));
    }

    @Override
    public IntegrationInstanceConfiguration getIntegrationIntegrationInstanceConfiguration(
        long id, Environment environment, boolean enabled) {

        return OptionalUtils.get(
            integrationInstanceConfigurationRepository.findByIntegrationIdAndEnvironmentAndEnabled(
                id, environment.ordinal(), enabled));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Long> getIntegrationIds() {
        return integrationInstanceConfigurationRepository.findAllIntegrationIds();
    }

    @Override
    @Transactional(readOnly = true)
    public List<IntegrationInstanceConfiguration> getIntegrationInstanceConfigurations() {
        return getIntegrationInstanceConfigurations(null, null, null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<IntegrationInstanceConfiguration> getIntegrationInstanceConfigurations(long integrationId) {
        return getIntegrationInstanceConfigurations(null, integrationId, null);
    }

    @Override
    public List<IntegrationInstanceConfiguration> getIntegrationInstanceConfigurations(
        Environment environment, boolean enabled) {

        return integrationInstanceConfigurationRepository.findAllByEnvironmentAndEnabled(
            environment.ordinal(), enabled);
    }

    @Override
    @Transactional(readOnly = true)
    public List<IntegrationInstanceConfiguration> getIntegrationInstanceConfigurations(List<Long> ids) {
        if (ids.isEmpty()) {
            return List.of();
        }

        return integrationInstanceConfigurationRepository.findAllByIdIn(ids);
    }

    @Override
    @Transactional(readOnly = true)
    public List<IntegrationInstanceConfiguration> getIntegrationInstanceConfigurations(
        Environment environment, Long integrationId, Long tagId) {

        return integrationInstanceConfigurationRepository.findAllIntegrationInstanceConfigurations(
            environment == null ? null : environment.ordinal(), integrationId, tagId);
    }

    @Override
    @Transactional(readOnly = true)
    public boolean isIntegrationInstanceConfigurationEnabled(long integrationInstanceConfigurationId) {
        return integrationInstanceConfigurationRepository.findById(integrationInstanceConfigurationId)
            .map(integrationInstanceConfiguration -> integrationInstanceConfiguration.isEnabled())
            .orElse(false);
    }

    @Override
    public IntegrationInstanceConfiguration update(long id, List<Long> tagIds) {
        IntegrationInstanceConfiguration integrationInstance = getIntegrationInstanceConfiguration(id);

        integrationInstance.setTagIds(tagIds);

        return integrationInstanceConfigurationRepository.save(integrationInstance);
    }

    @Override
    public IntegrationInstanceConfiguration update(IntegrationInstanceConfiguration integrationInstanceConfiguration) {
        Assert.notNull(integrationInstanceConfiguration, "'integrationInstance' must not be null");
        Assert.notNull(integrationInstanceConfiguration.getIntegrationId(), "'integrationId' must not be null");

        IntegrationInstanceConfiguration curIntegrationInstanceConfiguration =
            getIntegrationInstanceConfiguration(Validate.notNull(integrationInstanceConfiguration.getId(), "id"));

        curIntegrationInstanceConfiguration.setDescription(integrationInstanceConfiguration.getDescription());
        curIntegrationInstanceConfiguration.setEnabled(integrationInstanceConfiguration.isEnabled());
        curIntegrationInstanceConfiguration.setIntegrationVersion(
            integrationInstanceConfiguration.getIntegrationVersion());
        curIntegrationInstanceConfiguration.setName(integrationInstanceConfiguration.getName());
        curIntegrationInstanceConfiguration.setTagIds(integrationInstanceConfiguration.getTagIds());
        curIntegrationInstanceConfiguration.setVersion(integrationInstanceConfiguration.getVersion());

        return integrationInstanceConfigurationRepository.save(curIntegrationInstanceConfiguration);
    }

    @Override
    public void updateEnabled(long id, boolean enabled) {
        IntegrationInstanceConfiguration integrationInstanceConfiguration = getIntegrationInstanceConfiguration(id);

        integrationInstanceConfiguration.setEnabled(enabled);

        integrationInstanceConfigurationRepository.save(integrationInstanceConfiguration);
    }
}
