package vn.i18n;

import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

/**
 * I18N
 *
 * @author Nong Hoang Vu
 */
public class I18N {
    /**
     * MessageSource
     */
    private final org.springframework.context.MessageSource messageSource;

    /**
     * Setter method for Spring to automatically inject MessageSource
     *
     * @param messageSource MessageSource
     */
    public I18N(org.springframework.context.MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    /**
     * Method to get message with parameters
     *
     * @param code code
     * @param args args
     * @return msg
     */
    public String getMessage(String code, Object args) {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(code, new Object[]{args}, locale);
    }

    /**
     * The method to get the message has no parameters
     *
     * @param code code
     * @return msg
     */
    public String getMessage(String code) {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(code, null, locale);
    }
}
