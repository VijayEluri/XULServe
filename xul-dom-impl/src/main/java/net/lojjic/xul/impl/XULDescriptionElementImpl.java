package net.lojjic.xul.impl;

import net.lojjic.xul.XULDescriptionElement;

/**
 * {@link net.lojjic.xul.XULDescriptionElement} implementation
 */
public class XULDescriptionElementImpl extends XULElementImpl
       implements XULDescriptionElement {
	
	public XULDescriptionElementImpl(XULDocumentImpl ownerDocument, String qualifiedName) {
		super(ownerDocument, qualifiedName);
	}

	public boolean isCrop() {
		return Boolean.parseBoolean(getAttribute("crop"));
	}
	
	public void setCrop(boolean crop) {
		setAttribute("crop", String.valueOf(crop));
	}
	
	public boolean isDisabled() {
		return Boolean.parseBoolean(getAttribute("disabled"));
	}
	
	public void setDisabled(boolean disabled) {
		setAttribute("disabled", String.valueOf(disabled));
	}
	
	public String getValue() {
		return getAttribute("value");
	}
	
	public void setValue(String value) {
		setAttribute("value", value);
	}
	
}
