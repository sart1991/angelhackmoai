package com.moai.data.services;

import com.moai.data.db.daos.*;
import com.moai.data.db.models.MeasureUnit;
import com.moai.data.db.models.Property;
import com.moai.data.db.models.ResourceNeedCapacity;

import java.sql.SQLException;
import java.util.List;

public class ResourceNeedCapacityService {

    private static ResourceNeedCapacityService instance;

    private ResourceNeedCapacityService() {

    }

    public static ResourceNeedCapacityService get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized ResourceNeedCapacityService getSync() {
        if (instance == null) instance =  new ResourceNeedCapacityService();
        return instance;
    }


    public List<ResourceNeedCapacity> getResourcesByProjectId(long projectId) throws SQLException {
        List<ResourceNeedCapacity> resources = ResourceNeedCapacityDao.get().getResourcesList(projectId);

        for (ResourceNeedCapacity r : resources) {
            r.setResource(ResourceDao.get().getResource(r.getResourceIdResource()));
            r.setInversions(InversionDao.get().getInversionsByResource(r.getIdNeedCapacity()));
            r.setProperties(PropertyDao.get().getProperties(r.getIdNeedCapacity()));
            /*for (Property p : r.getProperties()){
                //p.setMeasureUnit(MeasureUnitDao.get().getMeasureUnit(p.getMeasureUnit().));

            }*/
        }
        return resources;
    }




}
