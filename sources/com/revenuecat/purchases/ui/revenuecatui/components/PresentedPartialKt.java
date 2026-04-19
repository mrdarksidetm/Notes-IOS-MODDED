package com.revenuecat.purchases.ui.revenuecatui.components;

import ae.r;
import com.revenuecat.purchases.paywalls.components.PartialComponent;
import com.revenuecat.purchases.paywalls.components.common.ComponentConditions;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverrides;
import com.revenuecat.purchases.paywalls.components.common.ComponentStates;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import md.q;
import nd.t;
import nd.u;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class PresentedPartialKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ComponentViewState.values().length];
            try {
                iArr[ComponentViewState.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComponentViewState.SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ScreenCondition.values().length];
            try {
                iArr2[ScreenCondition.COMPACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ScreenCondition.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ScreenCondition.EXPANDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final /* synthetic */ PresentedPartial buildPresentedPartial(PresentedOverrides presentedOverrides, ScreenCondition screenCondition, boolean z10, ComponentViewState componentViewState) {
        r.f(presentedOverrides, "<this>");
        r.f(screenCondition, "windowSize");
        r.f(componentViewState, "state");
        PresentedPartial presentedPartialBuildScreenConditionPartial = buildScreenConditionPartial(presentedOverrides, screenCondition);
        if (z10) {
            presentedPartialBuildScreenConditionPartial = combineOrReplace(presentedPartialBuildScreenConditionPartial, presentedOverrides.getIntroOffer());
        }
        if (WhenMappings.$EnumSwitchMapping$0[componentViewState.ordinal()] != 2) {
            return presentedPartialBuildScreenConditionPartial;
        }
        PresentedStates states = presentedOverrides.getStates();
        return combineOrReplace(presentedPartialBuildScreenConditionPartial, states != null ? states.getSelected() : null);
    }

    private static final <T extends PresentedPartial<T>> T buildScreenConditionPartial(PresentedOverrides<T> presentedOverrides, ScreenCondition screenCondition) {
        PresentedConditions conditions = presentedOverrides.getConditions();
        List<ScreenCondition> applicableConditions = getApplicableConditions(screenCondition);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = applicableConditions.iterator();
        while (true) {
            Object next = null;
            if (!it.hasNext()) {
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    while (it2.hasNext()) {
                        next = ((PresentedPartial) next).combine((PresentedPartial) it2.next());
                    }
                }
                return (T) next;
            }
            int i10 = WhenMappings.$EnumSwitchMapping$1[((ScreenCondition) it.next()).ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new q();
                    }
                    if (conditions != null) {
                        next = conditions.getExpanded();
                    }
                } else if (conditions != null) {
                    next = conditions.getMedium();
                }
            } else if (conditions != null) {
                next = conditions.getCompact();
            }
            if (next != null) {
                arrayList.add(next);
            }
        }
    }

    private static final <T extends PresentedPartial<T>> T combineOrReplace(PresentedPartial<T> presentedPartial, T t10) {
        T t11;
        return (presentedPartial == null || (t11 = (T) presentedPartial.combine(t10)) == null) ? t10 : t11;
    }

    private static final List<ScreenCondition> getApplicableConditions(ScreenCondition screenCondition) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[screenCondition.ordinal()];
        if (i10 == 1) {
            return t.d(ScreenCondition.COMPACT);
        }
        if (i10 == 2) {
            return u.p(ScreenCondition.COMPACT, ScreenCondition.MEDIUM);
        }
        if (i10 == 3) {
            return u.p(ScreenCondition.COMPACT, ScreenCondition.MEDIUM, ScreenCondition.EXPANDED);
        }
        throw new q();
    }

    public static final /* synthetic */ Result toPresentedOverrides(ComponentOverrides componentOverrides, l lVar) {
        PresentedPartial presentedPartial;
        PresentedPartial presentedPartial2;
        PresentedPartial presentedPartial3;
        PresentedPartial presentedPartial4;
        Result result;
        Result result2;
        Result result3;
        PartialComponent selected;
        Result result4;
        Result result5;
        r.f(componentOverrides, "<this>");
        r.f(lVar, "transform");
        PartialComponent introOffer = componentOverrides.getIntroOffer();
        PresentedConditions presentedConditions = null;
        presentedPartial = null;
        PresentedPartial presentedPartial5 = null;
        if (introOffer == null || (result5 = (Result) lVar.invoke(introOffer)) == null) {
            presentedPartial = null;
        } else {
            if (!(result5 instanceof Result.Success)) {
                if (result5 instanceof Result.Error) {
                    return new Result.Error((PaywallValidationError) ((Result.Error) result5).getValue());
                }
                throw new q();
            }
            presentedPartial = (PresentedPartial) ((Result.Success) result5).getValue();
        }
        ComponentStates states = componentOverrides.getStates();
        if (states == null || (selected = states.getSelected()) == null || (result4 = (Result) lVar.invoke(selected)) == null) {
            presentedPartial2 = null;
        } else {
            if (!(result4 instanceof Result.Success)) {
                if (result4 instanceof Result.Error) {
                    return new Result.Error((PaywallValidationError) ((Result.Error) result4).getValue());
                }
                throw new q();
            }
            presentedPartial2 = (PresentedPartial) ((Result.Success) result4).getValue();
        }
        PresentedStates presentedStates = componentOverrides.getStates() != null ? new PresentedStates(presentedPartial2) : null;
        ComponentConditions conditions = componentOverrides.getConditions();
        if (conditions != null) {
            PartialComponent compact = conditions.getCompact();
            if (compact == null || (result3 = (Result) lVar.invoke(compact)) == null) {
                presentedPartial3 = null;
            } else {
                if (!(result3 instanceof Result.Success)) {
                    if (result3 instanceof Result.Error) {
                        return new Result.Error((PaywallValidationError) ((Result.Error) result3).getValue());
                    }
                    throw new q();
                }
                presentedPartial3 = (PresentedPartial) ((Result.Success) result3).getValue();
            }
            PartialComponent medium = conditions.getMedium();
            if (medium == null || (result2 = (Result) lVar.invoke(medium)) == null) {
                presentedPartial4 = null;
            } else {
                if (!(result2 instanceof Result.Success)) {
                    if (result2 instanceof Result.Error) {
                        return new Result.Error((PaywallValidationError) ((Result.Error) result2).getValue());
                    }
                    throw new q();
                }
                presentedPartial4 = (PresentedPartial) ((Result.Success) result2).getValue();
            }
            PartialComponent expanded = conditions.getExpanded();
            if (expanded != null && (result = (Result) lVar.invoke(expanded)) != null) {
                if (!(result instanceof Result.Success)) {
                    if (result instanceof Result.Error) {
                        return new Result.Error((PaywallValidationError) ((Result.Error) result).getValue());
                    }
                    throw new q();
                }
                presentedPartial5 = (PresentedPartial) ((Result.Success) result).getValue();
            }
            presentedConditions = new PresentedConditions(presentedPartial3, presentedPartial4, presentedPartial5);
        }
        return new Result.Success(new PresentedOverrides(presentedPartial, presentedStates, presentedConditions));
    }
}
