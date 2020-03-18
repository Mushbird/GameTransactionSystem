package com.mushbird.sinsege.base.config.excel;

import com.mushbird.sinsege.core.servlet.view.encoding.DefaultFilenameEncoder;
import com.mushbird.sinsege.core.servlet.view.encoding.FilenameEncoder;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

public class CustomExcel2ViewResolver extends UrlBasedViewResolver {

    private FilenameEncoder filenameEncoder = new DefaultFilenameEncoder();

    public CustomExcel2ViewResolver() {
        setViewClass(requiredViewClass());
    }

    @Override
    protected Class<?> requiredViewClass() {
        return CustomExcel2View.class;
    }

    @Override
    protected CustomExcel2View buildView(String viewName) throws Exception {
        CustomExcel2View view = (CustomExcel2View) super.buildView(viewName);
        view.setViewName(viewName);
        view.setPrefix(getPrefix());
        view.setSuffix(getSuffix());
        view.setFilenameEncoder(getFilenameEncoder());

        return view;
    }

    @Override
    public void setSuffix(String suffix) {
        super.setSuffix(suffix == null ? null : suffix.toLowerCase());
    }

    public FilenameEncoder getFilenameEncoder() {
        return filenameEncoder;
    }

    public void setFilenameEncoder(FilenameEncoder filenameEncoder) {
        this.filenameEncoder = filenameEncoder;
    }

}
