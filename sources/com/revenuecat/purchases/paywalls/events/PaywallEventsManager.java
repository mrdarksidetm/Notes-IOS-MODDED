package com.revenuecat.purchases.paywalls.events;

import ae.h0;
import ae.j;
import ae.r;
import ae.s;
import com.amazon.a.a.o.c.a.b;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.paywalls.events.PaywallEventsManager;
import com.revenuecat.purchases.utils.EventsFileHelper;
import ie.g;
import ie.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import md.i0;
import nd.c0;
import nd.u;
import nd.v;
import zd.a;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallEventsManager {
    public static final Companion Companion = new Companion(null);
    private static final int FLUSH_COUNT = 50;
    public static final String PAYWALL_EVENTS_FILE_PATH = "RevenueCat/paywall_event_store/paywall_event_store.jsonl";
    private final Backend backend;
    private final EventsFileHelper<PaywallStoredEvent> fileHelper;
    private boolean flushInProgress;
    private final IdentityManager identityManager;
    private final Dispatcher paywallEventsDispatcher;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements a<i0> {

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends s implements a<i0> {
            final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
            final /* synthetic */ PaywallEventsManager this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$2$1, reason: invalid class name and collision with other inner class name */
            static final class C02021 extends s implements a<i0> {
                final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
                final /* synthetic */ PaywallEventsManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02021(PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                    super(0);
                    this.this$0 = paywallEventsManager;
                    this.$eventsToSyncWithNullValues = list;
                }

                @Override // zd.a
                public /* bridge */ /* synthetic */ i0 invoke() {
                    invoke2();
                    return i0.f15558a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.fileHelper.clear(this.$eventsToSyncWithNullValues.size());
                    this.this$0.flushInProgress = false;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                super(0);
                this.this$0 = paywallEventsManager;
                this.$eventsToSyncWithNullValues = list;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LogUtilsKt.verboseLog("Paywall event flush: success.");
                PaywallEventsManager paywallEventsManager = this.this$0;
                PaywallEventsManager.enqueue$default(paywallEventsManager, null, new C02021(paywallEventsManager, this.$eventsToSyncWithNullValues), 1, null);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends s implements p<PurchasesError, Boolean, i0> {
            final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
            final /* synthetic */ PaywallEventsManager this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$3$1, reason: invalid class name and collision with other inner class name */
            static final class C02031 extends s implements a<i0> {
                final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
                final /* synthetic */ boolean $shouldMarkAsSynced;
                final /* synthetic */ PaywallEventsManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02031(boolean z10, PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                    super(0);
                    this.$shouldMarkAsSynced = z10;
                    this.this$0 = paywallEventsManager;
                    this.$eventsToSyncWithNullValues = list;
                }

                @Override // zd.a
                public /* bridge */ /* synthetic */ i0 invoke() {
                    invoke2();
                    return i0.f15558a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (this.$shouldMarkAsSynced) {
                        this.this$0.fileHelper.clear(this.$eventsToSyncWithNullValues.size());
                    }
                    this.this$0.flushInProgress = false;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                super(2);
                this.this$0 = paywallEventsManager;
                this.$eventsToSyncWithNullValues = list;
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Boolean bool) {
                invoke(purchasesError, bool.booleanValue());
                return i0.f15558a;
            }

            public final void invoke(PurchasesError purchasesError, boolean z10) {
                r.f(purchasesError, "error");
                LogUtilsKt.errorLog$default("Paywall event flush error: " + purchasesError + b.f7490a, null, 2, null);
                PaywallEventsManager paywallEventsManager = this.this$0;
                PaywallEventsManager.enqueue$default(paywallEventsManager, null, new C02031(z10, paywallEventsManager, this.$eventsToSyncWithNullValues), 1, null);
            }
        }

        AnonymousClass1() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (PaywallEventsManager.this.flushInProgress) {
                LogUtilsKt.debugLog("Flush already in progress.");
                return;
            }
            PaywallEventsManager.this.flushInProgress = true;
            List eventsToSync = PaywallEventsManager.this.getEventsToSync();
            List listV = c0.V(eventsToSync);
            int size = listV.size();
            if (listV.isEmpty()) {
                LogUtilsKt.verboseLog("No paywall events to sync.");
                PaywallEventsManager.this.flushInProgress = false;
                return;
            }
            LogUtilsKt.verboseLog("Paywall event flush: posting " + size + " events.");
            Backend backend = PaywallEventsManager.this.backend;
            ArrayList arrayList = new ArrayList(v.x(listV, 10));
            Iterator it = listV.iterator();
            while (it.hasNext()) {
                arrayList.add(((PaywallStoredEvent) it.next()).toPaywallBackendEvent());
            }
            backend.postPaywallEvents(new PaywallEventRequest(arrayList), new AnonymousClass2(PaywallEventsManager.this, eventsToSync), new AnonymousClass3(PaywallEventsManager.this, eventsToSync));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$getEventsToSync$1, reason: invalid class name and case insensitive filesystem */
    static final class C06081 extends s implements l<g<? extends PaywallStoredEvent>, i0> {
        final /* synthetic */ h0<List<PaywallStoredEvent>> $eventsToSync;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06081(h0<List<PaywallStoredEvent>> h0Var) {
            super(1);
            this.$eventsToSync = h0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(g<? extends PaywallStoredEvent> gVar) {
            invoke2((g<PaywallStoredEvent>) gVar);
            return i0.f15558a;
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [T, java.util.List] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(g<PaywallStoredEvent> gVar) {
            r.f(gVar, "sequence");
            this.$eventsToSync.f712a = o.v(o.u(gVar, 50));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$track$1, reason: invalid class name and case insensitive filesystem */
    static final class C06091 extends s implements a<i0> {
        final /* synthetic */ PaywallEvent $event;
        final /* synthetic */ PaywallEventsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06091(PaywallEvent paywallEvent, PaywallEventsManager paywallEventsManager) {
            super(0);
            this.$event = paywallEvent;
            this.this$0 = paywallEventsManager;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LogUtilsKt.debugLog("Tracking paywall event: " + this.$event);
            this.this$0.fileHelper.appendEvent(new PaywallStoredEvent(this.$event, this.this$0.identityManager.getCurrentAppUserID()));
        }
    }

    public PaywallEventsManager(EventsFileHelper<PaywallStoredEvent> eventsFileHelper, IdentityManager identityManager, Dispatcher dispatcher, Backend backend) {
        r.f(eventsFileHelper, "fileHelper");
        r.f(identityManager, "identityManager");
        r.f(dispatcher, "paywallEventsDispatcher");
        r.f(backend, "backend");
        this.fileHelper = eventsFileHelper;
        this.identityManager = identityManager;
        this.paywallEventsDispatcher = dispatcher;
        this.backend = backend;
    }

    private final void enqueue(Delay delay, final a<i0> aVar) {
        this.paywallEventsDispatcher.enqueue(new Runnable() { // from class: ub.a
            @Override // java.lang.Runnable
            public final void run() {
                PaywallEventsManager.enqueue$lambda$0(aVar);
            }
        }, delay);
    }

    static /* synthetic */ void enqueue$default(PaywallEventsManager paywallEventsManager, Delay delay, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            delay = Delay.NONE;
        }
        paywallEventsManager.enqueue(delay, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$0(a aVar) {
        r.f(aVar, "$command");
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.List] */
    public final List<PaywallStoredEvent> getEventsToSync() {
        h0 h0Var = new h0();
        h0Var.f712a = u.m();
        this.fileHelper.readFile(new C06081(h0Var));
        return (List) h0Var.f712a;
    }

    public final synchronized void flushEvents() {
        enqueue$default(this, null, new AnonymousClass1(), 1, null);
    }

    public final synchronized void track(PaywallEvent paywallEvent) {
        r.f(paywallEvent, "event");
        enqueue$default(this, null, new C06091(paywallEvent, this), 1, null);
    }
}
