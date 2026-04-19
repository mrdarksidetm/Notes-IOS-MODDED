package com.revenuecat.purchases.ui.revenuecatui.components.style;

import ae.j;
import ae.r;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import md.i0;
import t0.o;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class ButtonComponentStyle implements ComponentStyle {
    public static final Companion Companion = new Companion(null);
    private final PaywallAction action;
    private final l<PaywallAction, i0> actionHandler;
    private final StackComponentStyle stackComponentStyle;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final /* synthetic */ ButtonComponentStyle invoke(StackComponentStyle stackComponentStyle, PaywallAction paywallAction, l lVar, t0.l lVar2, int i10) {
            r.f(stackComponentStyle, "stackComponentStyle");
            r.f(paywallAction, "action");
            r.f(lVar, "actionHandler");
            lVar2.e(32393639);
            if (o.I()) {
                o.U(32393639, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle.Companion.invoke (ButtonComponentStyle.kt:20)");
            }
            ButtonComponentStyle buttonComponentStyle = new ButtonComponentStyle(stackComponentStyle, paywallAction, lVar, null);
            if (o.I()) {
                o.T();
            }
            lVar2.K();
            return buttonComponentStyle;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ButtonComponentStyle(StackComponentStyle stackComponentStyle, PaywallAction paywallAction, l<? super PaywallAction, i0> lVar) {
        this.stackComponentStyle = stackComponentStyle;
        this.action = paywallAction;
        this.actionHandler = lVar;
    }

    public /* synthetic */ ButtonComponentStyle(StackComponentStyle stackComponentStyle, PaywallAction paywallAction, l lVar, j jVar) {
        this(stackComponentStyle, paywallAction, lVar);
    }

    public final /* synthetic */ PaywallAction getAction() {
        return this.action;
    }

    public final /* synthetic */ l getActionHandler() {
        return this.actionHandler;
    }

    public final /* synthetic */ StackComponentStyle getStackComponentStyle() {
        return this.stackComponentStyle;
    }
}
