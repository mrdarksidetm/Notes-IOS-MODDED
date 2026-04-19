package com.revenuecat.purchases.common.diagnostics;

import ae.h0;
import ae.j;
import ae.r;
import ae.s;
import android.content.Context;
import android.content.SharedPreferences;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import ie.g;
import ie.o;
import java.io.IOException;
import java.util.List;
import md.i0;
import nd.u;
import org.json.JSONObject;
import zd.a;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class DiagnosticsSynchronizer {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_EVENTS_TO_SYNC_PER_REQUEST = 200;
    public static final int MAX_NUMBER_POST_RETRIES = 3;
    private final Backend backend;
    private final Dispatcher diagnosticsDispatcher;
    private final DiagnosticsFileHelper diagnosticsFileHelper;
    private final DiagnosticsHelper diagnosticsHelper;
    private final DiagnosticsTracker diagnosticsTracker;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ void getMAX_EVENTS_TO_SYNC_PER_REQUEST$annotations() {
        }

        public static /* synthetic */ void getMAX_NUMBER_POST_RETRIES$annotations() {
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            r.f(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com_revenuecat_purchases_" + context.getPackageName() + "_preferences_diagnostics", 0);
            r.e(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$getEventsToSync$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<g<? extends JSONObject>, i0> {
        final /* synthetic */ h0<List<JSONObject>> $eventsToSync;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(h0<List<JSONObject>> h0Var) {
            super(1);
            this.$eventsToSync = h0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(g<? extends JSONObject> gVar) {
            invoke2(gVar);
            return i0.f15558a;
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [T, java.util.List] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(g<? extends JSONObject> gVar) {
            r.f(gVar, "sequence");
            this.$eventsToSync.f712a = o.v(o.u(gVar, 200));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    static final class C05571 extends s implements a<i0> {

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01961 extends s implements l<JSONObject, i0> {
            final /* synthetic */ int $diagnosticsCount;
            final /* synthetic */ DiagnosticsSynchronizer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01961(DiagnosticsSynchronizer diagnosticsSynchronizer, int i10) {
                super(1);
                this.this$0 = diagnosticsSynchronizer;
                this.$diagnosticsCount = i10;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(JSONObject jSONObject) {
                invoke2(jSONObject);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(JSONObject jSONObject) {
                r.f(jSONObject, "it");
                LogUtilsKt.verboseLog("Synced diagnostics file successfully.");
                this.this$0.diagnosticsHelper.clearConsecutiveNumberOfErrors();
                this.this$0.diagnosticsFileHelper.clear(this.$diagnosticsCount);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends s implements p<PurchasesError, Boolean, i0> {
            final /* synthetic */ DiagnosticsSynchronizer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DiagnosticsSynchronizer diagnosticsSynchronizer) {
                super(2);
                this.this$0 = diagnosticsSynchronizer;
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Boolean bool) {
                invoke(purchasesError, bool.booleanValue());
                return i0.f15558a;
            }

            public final void invoke(PurchasesError purchasesError, boolean z10) {
                r.f(purchasesError, "error");
                if (!z10) {
                    LogUtilsKt.verboseLog("Error syncing diagnostics file: " + purchasesError + ". Deleting diagnostics file without retrying.");
                    this.this$0.diagnosticsHelper.resetDiagnosticsStatus();
                    this.this$0.diagnosticsTracker.trackClearingDiagnosticsAfterFailedSync();
                    return;
                }
                LogUtilsKt.verboseLog("Error syncing diagnostics file: " + purchasesError + ". Will retry the next time the SDK is initialized");
                if (this.this$0.diagnosticsHelper.increaseConsecutiveNumberOfErrors() >= 3) {
                    LogUtilsKt.verboseLog("Error syncing diagnostics file: " + purchasesError + ". This was the final attempt (3). Deleting diagnostics file without posting.");
                    this.this$0.diagnosticsHelper.resetDiagnosticsStatus();
                    this.this$0.diagnosticsTracker.trackMaxDiagnosticsSyncRetriesReached();
                }
            }
        }

        C05571() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            try {
                List<? extends JSONObject> eventsToSync = DiagnosticsSynchronizer.this.getEventsToSync();
                int size = eventsToSync.size();
                if (size == 0) {
                    LogUtilsKt.verboseLog("No diagnostics to sync.");
                } else {
                    DiagnosticsSynchronizer.this.backend.postDiagnostics(eventsToSync, new C01961(DiagnosticsSynchronizer.this, size), new AnonymousClass2(DiagnosticsSynchronizer.this));
                }
            } catch (Exception e10) {
                LogUtilsKt.verboseLog("Error syncing diagnostics file: " + e10);
                try {
                    DiagnosticsSynchronizer.this.diagnosticsHelper.resetDiagnosticsStatus();
                } catch (IOException e11) {
                    LogUtilsKt.verboseLog("Error deleting diagnostics file: " + e11);
                }
            }
        }
    }

    public DiagnosticsSynchronizer(DiagnosticsHelper diagnosticsHelper, DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsTracker diagnosticsTracker, Backend backend, Dispatcher dispatcher) {
        r.f(diagnosticsHelper, "diagnosticsHelper");
        r.f(diagnosticsFileHelper, "diagnosticsFileHelper");
        r.f(diagnosticsTracker, "diagnosticsTracker");
        r.f(backend, "backend");
        r.f(dispatcher, "diagnosticsDispatcher");
        this.diagnosticsHelper = diagnosticsHelper;
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.diagnosticsTracker = diagnosticsTracker;
        this.backend = backend;
        this.diagnosticsDispatcher = dispatcher;
    }

    private final void enqueue(final a<i0> aVar) {
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new Runnable() { // from class: lb.a
            @Override // java.lang.Runnable
            public final void run() {
                DiagnosticsSynchronizer.enqueue$lambda$0(aVar);
            }
        }, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$0(a aVar) {
        r.f(aVar, "$tmp0");
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.List] */
    public final List<JSONObject> getEventsToSync() {
        h0 h0Var = new h0();
        h0Var.f712a = u.m();
        this.diagnosticsFileHelper.readFileAsJson(new AnonymousClass1(h0Var));
        return (List) h0Var.f712a;
    }

    public final void syncDiagnosticsFileIfNeeded() {
        enqueue(new C05571());
    }
}
