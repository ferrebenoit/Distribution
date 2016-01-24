/**
 * 
 */
package org.distribution.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.distribution.jpa.entity.ActionType;;

/**
 * @author ben
 *
 */
@Converter(autoApply = true)
public class ActionTypeConverter  implements AttributeConverter<ActionType, Integer> {

	@Override
	public Integer convertToDatabaseColumn(ActionType attribute) {
		return attribute.getShortName();
	}

	@Override
	public ActionType convertToEntityAttribute(Integer dbData) {
		return ActionType.fromShortName(dbData);
	}

}
