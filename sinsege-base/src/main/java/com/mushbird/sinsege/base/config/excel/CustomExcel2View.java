package com.mushbird.sinsege.base.config.excel;

import com.mushbird.rivendell.core.servlet.view.excel.Excel2View;

import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;

public class CustomExcel2View extends Excel2View {

    @Override
    protected String getBasename(HttpServletRequest request, Bundle bundle) throws FileNotFoundException {
        return bundle.getFilename() != null ? bundle.getFilename() : getTemplate(request, bundle).getFilename();
    }

}
