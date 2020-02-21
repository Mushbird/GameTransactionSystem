package com.mushbird.sinsege.base.config.excel;

import com.mushbird.rivendell.core.servlet.view.encoding.FilenameEncoder;
import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.UserAgent;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

public class CustomFilenameEncoder extends FilenameEncoder {

    /**
     * 운영체제에서 예약된 문자치환
     */
    private static final char[] RESERVED_OS_CHARS = new char[]{'/', '\\', '?', '%', '*', ':', '|', '"', '<', '>'};

    /**
     * 운영체제 예약어 치환문자
     */
    private char replaceOsChar = '_';

    @Override
    public String encode(HttpServletRequest request, String filename) throws UnsupportedEncodingException {
        if (filename != null) {
            for (char reservedChar : RESERVED_OS_CHARS) {
                filename = filename.replace(reservedChar, replaceOsChar);
            }
        }

        String userAgentString = request.getHeader("User-Agent");
        if (userAgentString == null)
            return filename;

        UserAgent userAgent = UserAgent.parseUserAgentString(userAgentString);
        Browser browser = userAgent.getBrowser();
        String encoding = request.getCharacterEncoding();

        if (Browser.IE.equals(browser.getGroup()))
            return java.net.URLEncoder.encode(filename, encoding);
        else
            return new String(filename.getBytes(encoding), "ISO-8859-1");
    }

}
