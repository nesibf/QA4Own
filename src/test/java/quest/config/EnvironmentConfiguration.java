package quest.config;

import quest.utility.PropertiesUtil;

public final class EnvironmentConfiguration {

    private static PropertiesUtil propertiesUtil = new PropertiesUtil("prerequisite.properties");

    private EnvironmentConfiguration() {

    }

    public static String getValue(final String key) {
        return propertiesUtil.getValue(key);
    }
}
