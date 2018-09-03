package io.agrest.meta;

import com.fasterxml.jackson.databind.JsonNode;
import io.agrest.LrObjectId;

import java.util.Map;

/**
 * @since 1.12
 */
public interface LrPersistentRelationship extends LrRelationship {

	boolean isToDependentEntity();

	boolean isPrimaryKey();

//	LrPersistentRelationship getReverseRelationship(); // ???

	Map<String, Object> extractId(LrObjectId id); // TODO: move this to a separate place?

	Map<String, Object> extractId(JsonNode id); // TODO: move this to a separate place?
}
