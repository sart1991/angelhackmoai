package com.moai.endpoints;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.moai.data.db.models.ResourceNeedCapacity;
import com.moai.data.services.ResourceNeedCapacityService;

import java.sql.SQLException;
import java.util.List;

@Api(
        name = "resourceNeedCapacity",
        version = "v1",
        namespace =
        @ApiNamespace(
                ownerDomain = "endpoints.moai.com",
                ownerName = "endpoints.moai.com",
                packagePath = ""
        )
)
public class ResourceNeedCapacityEndpoint {

    public ResourceNeedCapacityEndpoint() {
    }

    @ApiMethod(name = "resourceNeedCapacity", path = "/resourceNeedCapacity", httpMethod = ApiMethod.HttpMethod.GET)
    public List<ResourceNeedCapacity> resources(@Named("idProject") final long idProject) throws SQLException {
        return ResourceNeedCapacityService.get().getResourcesByProjectId(idProject);
    }
}
