package com.moai.endpoints;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.response.UnauthorizedException;
import com.moai.data.db.daos.UserDao;
import com.moai.data.db.models.User;

import java.sql.SQLException;

@Api(
        name = "user",
        version = "v1",
        namespace =
        @ApiNamespace(
                ownerDomain = "endpoints.moai.com",
                ownerName = "endpoints.moai.com",
                packagePath = ""
        )

)
public class UserEndpoint {
    @ApiMethod(name = "test", path = "/location/test", httpMethod = ApiMethod.HttpMethod.GET)
    public User test(@Named("input") final String input) throws UnauthorizedException, SQLException {
       // LOGGER.info("obtener datos");

        return UserDao.get().getUser(0);
    }
}
