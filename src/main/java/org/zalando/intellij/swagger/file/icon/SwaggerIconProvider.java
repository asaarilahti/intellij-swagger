package org.zalando.intellij.swagger.file.icon;

import com.intellij.openapi.components.ServiceManager;
import javax.swing.Icon;
import org.zalando.intellij.swagger.index.IndexService;
import org.zalando.intellij.swagger.index.swagger.SwaggerIndexService;

public class SwaggerIconProvider extends SpecIconProvider {

  @Override
  protected Icon getIcon() {
    return Icons.SWAGGER_API_ICON;
  }

  @Override
  protected IndexService getIndexService() {
    return ServiceManager.getService(SwaggerIndexService.class);
  }
}
