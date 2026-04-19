package com.revenuecat.purchases.ui.revenuecatui;

import ae.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.revenuecat.purchases.ui.revenuecatui.PaywallMode, still in use, count: 1, list:
  (r0v0 com.revenuecat.purchases.ui.revenuecatui.PaywallMode) from 0x002c: SPUT (r0v0 com.revenuecat.purchases.ui.revenuecatui.PaywallMode) com.revenuecat.purchases.ui.revenuecatui.PaywallMode.default com.revenuecat.purchases.ui.revenuecatui.PaywallMode
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class PaywallMode {
    FULL_SCREEN,
    FOOTER,
    FOOTER_CONDENSED;


    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final PaywallMode f4default = new PaywallMode();
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final PaywallMode footerMode(boolean z10) {
            return z10 ? PaywallMode.FOOTER_CONDENSED : PaywallMode.FOOTER;
        }

        public final PaywallMode getDefault() {
            return PaywallMode.f4default;
        }
    }

    static {
    }

    private PaywallMode() {
    }

    public static PaywallMode valueOf(String str) {
        return (PaywallMode) Enum.valueOf(PaywallMode.class, str);
    }

    public static PaywallMode[] values() {
        return (PaywallMode[]) $VALUES.clone();
    }
}
