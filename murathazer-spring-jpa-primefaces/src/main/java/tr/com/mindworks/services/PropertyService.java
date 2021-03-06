package tr.com.mindworks.services;

import java.util.List;

import tr.com.mindworks.model.TProperty;
import tr.com.mindworks.model.TPropertyGroup;
import tr.com.mindworks.model.TPropertyLov;
import tr.com.mindworks.model.TPropertyLovDef;
import tr.com.mindworks.model.TPropertyType;

public interface PropertyService
{
	List<TProperty> findAll();
	void deleteProperty(Integer propertyId);
	TProperty findPropertyById(Integer propertyId);
	void saveProperty(TProperty property);
	
	
	List<TPropertyType> findAllPropertyType();
	List<TPropertyGroup> findAllPropertyGroup();
	

	void savePropertyLov(TPropertyLov newPropertyLov);
	void deletePropertyLov(Integer id);
	List<TPropertyLov> findAllPropertyLovByDefId(Integer propertyLovDefId);
	
	
	void savePropertyLovDef(TPropertyLovDef propertyLovDef);
	List<TPropertyLovDef> findAllPropertyLovDef();
	TPropertyLovDef findPropertyLovDefById(Integer propertyLovDefId);
	void deletePropertyLovDef(Integer propertyLovDefId);

	
	

	


}
