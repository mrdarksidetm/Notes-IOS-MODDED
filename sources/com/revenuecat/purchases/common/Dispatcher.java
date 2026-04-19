package com.revenuecat.purchases.common;

import ae.j;
import ae.r;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.verification.SignatureVerificationException;
import ee.c;
import ge.l;
import ge.o;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import ke.a;
import md.i0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class Dispatcher {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final double INTEGRATION_TEST_DELAY_PERCENTAGE = 0.01d;
    private final ExecutorService executorService;
    private final Handler mainHandler;
    private final boolean runningIntegrationTests;

    public static abstract class AsyncCall implements Runnable {
        public abstract HTTPResult call();

        public void onCompletion(HTTPResult hTTPResult) {
            r.f(hTTPResult, "result");
        }

        public void onError(PurchasesError purchasesError) {
            r.f(purchasesError, "error");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                onCompletion(call());
            } catch (SignatureVerificationException | IOException | SecurityException | JSONException e10) {
                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e10);
                LogUtilsKt.errorLog(purchasesError);
                onError(purchasesError);
            }
        }
    }

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public Dispatcher(ExecutorService executorService, Handler handler, boolean z10) {
        r.f(executorService, "executorService");
        this.executorService = executorService;
        this.mainHandler = handler;
        this.runningIntegrationTests = z10;
    }

    public /* synthetic */ Dispatcher(ExecutorService executorService, Handler handler, boolean z10, int i10, j jVar) {
        this(executorService, (i10 & 2) != 0 ? new Handler(Looper.getMainLooper()) : handler, (i10 & 4) != 0 ? false : z10);
    }

    public static /* synthetic */ void enqueue$default(Dispatcher dispatcher, Runnable runnable, Delay delay, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i10 & 2) != 0) {
            delay = Delay.NONE;
        }
        dispatcher.enqueue(runnable, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$2$lambda$1(Runnable runnable, Dispatcher dispatcher) {
        r.f(runnable, "$command");
        r.f(dispatcher, "this$0");
        try {
            runnable.run();
        } catch (Throwable th) {
            LogUtilsKt.errorLog$default("Exception running command: " + th, null, 2, null);
            Handler handler = dispatcher.mainHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: kb.b
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        Dispatcher.enqueue$lambda$2$lambda$1$lambda$0(th);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$2$lambda$1$lambda$0(Throwable th) throws Throwable {
        r.f(th, "$e");
        throw th;
    }

    public void close() {
        synchronized (this.executorService) {
            this.executorService.shutdownNow();
        }
    }

    public void enqueue(final Runnable runnable, Delay delay) {
        r.f(runnable, "command");
        r.f(delay, "delay");
        synchronized (this.executorService) {
            if (!this.executorService.isShutdown()) {
                Runnable runnable2 = new Runnable() { // from class: kb.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        Dispatcher.enqueue$lambda$2$lambda$1(runnable, this);
                    }
                };
                if (delay == Delay.NONE || !(this.executorService instanceof ScheduledExecutorService)) {
                    this.executorService.submit(runnable2);
                } else {
                    long jQ = o.q(new l(a.t(delay.m14getMinDelayUwyO8pc()), a.t(delay.m13getMaxDelayUwyO8pc())), c.f10965a);
                    if (this.runningIntegrationTests) {
                        jQ = (long) (jQ * 0.01d);
                    }
                    ((ScheduledExecutorService) this.executorService).schedule(runnable2, jQ, TimeUnit.MILLISECONDS);
                }
            }
            i0 i0Var = i0.f15558a;
        }
    }

    public boolean isClosed() {
        boolean zIsShutdown;
        synchronized (this.executorService) {
            zIsShutdown = this.executorService.isShutdown();
        }
        return zIsShutdown;
    }
}
