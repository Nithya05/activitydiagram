package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectProperties;

@Aspect(className = MergeNode.class)
@SuppressWarnings("all")
public class MergeNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final MergeNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspect._privk3_execute(_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspect.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static boolean hasOffers1(final MergeNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode){
    					result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspect._privk3_hasOffers1(_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode){
    					result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect.hasOffers1((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  private static void super_execute(final MergeNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final MergeNodeAspectMergeNodeAspectProperties _self_, final MergeNode _self) {
    EList<Token> _takeOfferdTokens1 = ActivityNodeAspect.takeOfferdTokens1(_self);
    ActivityNodeAspect.sendOffers1(_self, _takeOfferdTokens1);
  }
  
  protected static boolean _privk3_hasOffers1(final MergeNodeAspectMergeNodeAspectProperties _self_, final MergeNode _self) {
    EList<ActivityEdge> _incoming = _self.getIncoming();
    final Function1<ActivityEdge, Boolean> _function = (ActivityEdge edge) -> {
      return Boolean.valueOf(ActivityEdgeAspect.hasOffer1(edge));
    };
    return IterableExtensions.<ActivityEdge>exists(_incoming, _function);
  }
}
