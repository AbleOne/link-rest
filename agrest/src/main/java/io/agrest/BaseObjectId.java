package io.agrest;

import io.agrest.meta.LrAttribute;
import io.agrest.meta.LrEntity;

import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.Map;

/**
 * @since 1.24
 */
public abstract class BaseObjectId implements LrObjectId {

    @Override
    public Map<String, Object> asMap(LrEntity<?> entity) {

        if (entity == null) {
            throw new LinkRestException(Response.Status.INTERNAL_SERVER_ERROR,
                    "Can't build ID: entity is null");
        }

        Collection<LrAttribute> idAttributes = entity.getIds();
        if (idAttributes.size() != size()) {
            throw new LinkRestException(Response.Status.BAD_REQUEST,
                    "Wrong ID size: expected " + idAttributes.size() + ", got: " + size());
        }

        return asMap(idAttributes);
    }

    protected abstract Map<String, Object> asMap(Collection<LrAttribute> idAttributes);
}
