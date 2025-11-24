package vn.i18n;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class I18NConfig {

    private static final Logger log = LoggerFactory.getLogger(I18NConfig.class);

    @Bean
    public I18N messageUtils(org.springframework.context.MessageSource messageSource) {
        log.info("Source: {}", "https://github.com/nonghoangvu/i18n");
        return new I18N(messageSource);
    }
}
