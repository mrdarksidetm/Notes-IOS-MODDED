package com.revenuecat.purchases.common.diagnostics;

import ae.j;
import ae.r;
import ae.s;
import android.content.Context;
import android.content.SharedPreferences;
import md.l;
import md.n;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
public final class DiagnosticsHelper {
    public static final String CONSECUTIVE_FAILURES_COUNT_KEY = "consecutive_failures_count";
    public static final Companion Companion = new Companion(null);
    private final DiagnosticsFileHelper diagnosticsFileHelper;
    private final l<SharedPreferences> sharedPreferences;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsHelper$1, reason: invalid class name */
    public static final class AnonymousClass1 extends s implements a<SharedPreferences> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // zd.a
        public final SharedPreferences invoke() {
            return DiagnosticsHelper.Companion.initializeSharedPreferences(this.$context);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ void getCONSECUTIVE_FAILURES_COUNT_KEY$annotations() {
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            r.f(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com_revenuecat_purchases_" + context.getPackageName() + "_preferences_diagnostics", 0);
            r.e(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiagnosticsHelper(Context context, DiagnosticsFileHelper diagnosticsFileHelper, l<? extends SharedPreferences> lVar) {
        r.f(context, "context");
        r.f(diagnosticsFileHelper, "diagnosticsFileHelper");
        r.f(lVar, "sharedPreferences");
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.sharedPreferences = lVar;
    }

    public /* synthetic */ DiagnosticsHelper(Context context, DiagnosticsFileHelper diagnosticsFileHelper, l lVar, int i10, j jVar) {
        this(context, diagnosticsFileHelper, (i10 & 4) != 0 ? n.b(new AnonymousClass1(context)) : lVar);
    }

    public final void clearConsecutiveNumberOfErrors() {
        this.sharedPreferences.getValue().edit().remove(CONSECUTIVE_FAILURES_COUNT_KEY).apply();
    }

    public final int increaseConsecutiveNumberOfErrors() {
        int i10 = this.sharedPreferences.getValue().getInt(CONSECUTIVE_FAILURES_COUNT_KEY, 0) + 1;
        this.sharedPreferences.getValue().edit().putInt(CONSECUTIVE_FAILURES_COUNT_KEY, i10).apply();
        return i10;
    }

    public final void resetDiagnosticsStatus() {
        clearConsecutiveNumberOfErrors();
        this.diagnosticsFileHelper.deleteFile();
    }
}
