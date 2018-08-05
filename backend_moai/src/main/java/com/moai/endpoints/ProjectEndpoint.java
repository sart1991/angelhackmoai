package com.moai.endpoints;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.moai.data.db.daos.ProjectDao;
import com.moai.data.db.daos.ResourceNeedCapacityDao;
import com.moai.data.db.models.Project;
import com.moai.data.services.ProjectService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Api(
        name = "project",
        version = "v1",
        namespace =
        @ApiNamespace(
                ownerDomain = "endpoints.moai.com",
                ownerName = "endpoints.moai.com",
                packagePath = ""
        )

)
public class ProjectEndpoint {
    public ProjectEndpoint() {
    }

    @ApiMethod(name = "project", path = "/project", httpMethod = ApiMethod.HttpMethod.GET)
    public Project getProject(@Named("id") final long id) throws SQLException {
        return ProjectService.get().getProjectById(id);
    }
}
