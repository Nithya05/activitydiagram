package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.NamedElement;
import java.util.Map;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.NamedElementAspectNamedElementAspectProperties;

@SuppressWarnings("all")
public class NamedElementAspectNamedElementAspectContext {
  public final static NamedElementAspectNamedElementAspectContext INSTANCE = new NamedElementAspectNamedElementAspectContext();
  
  public static NamedElementAspectNamedElementAspectProperties getSelf(final NamedElement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.NamedElementAspectNamedElementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NamedElement, NamedElementAspectNamedElementAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.NamedElement, org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.NamedElementAspectNamedElementAspectProperties>();
  
  public Map<NamedElement, NamedElementAspectNamedElementAspectProperties> getMap() {
    return map;
  }
}
