package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import da.d0;
import da.w;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final w<ScheduledExecutorService> f8994a = new w<>(new ma.b() { // from class: ea.b
        @Override // ma.b
        public final Object get() {
            return ExecutorsRegistrar.p();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final w<ScheduledExecutorService> f8995b = new w<>(new ma.b() { // from class: ea.c
        @Override // ma.b
        public final Object get() {
            return ExecutorsRegistrar.q();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final w<ScheduledExecutorService> f8996c = new w<>(new ma.b() { // from class: ea.d
        @Override // ma.b
        public final Object get() {
            return ExecutorsRegistrar.r();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final w<ScheduledExecutorService> f8997d = new w<>(new ma.b() { // from class: ea.e
        @Override // ma.b
        public final Object get() {
            return ExecutorsRegistrar.s();
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(da.d dVar) {
        return f8994a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(da.d dVar) {
        return f8996c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(da.d dVar) {
        return f8995b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor o(da.d dVar) {
        return ea.j.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, f8997d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<da.c<?>> getComponents() {
        return Arrays.asList(da.c.d(d0.a(y9.a.class, ScheduledExecutorService.class), d0.a(y9.a.class, ExecutorService.class), d0.a(y9.a.class, Executor.class)).d(new da.g() { // from class: ea.f
            @Override // da.g
            public final Object a(da.d dVar) {
                return ExecutorsRegistrar.l(dVar);
            }
        }).c(), da.c.d(d0.a(y9.b.class, ScheduledExecutorService.class), d0.a(y9.b.class, ExecutorService.class), d0.a(y9.b.class, Executor.class)).d(new da.g() { // from class: ea.g
            @Override // da.g
            public final Object a(da.d dVar) {
                return ExecutorsRegistrar.m(dVar);
            }
        }).c(), da.c.d(d0.a(y9.c.class, ScheduledExecutorService.class), d0.a(y9.c.class, ExecutorService.class), d0.a(y9.c.class, Executor.class)).d(new da.g() { // from class: ea.h
            @Override // da.g
            public final Object a(da.d dVar) {
                return ExecutorsRegistrar.n(dVar);
            }
        }).c(), da.c.c(d0.a(y9.d.class, Executor.class)).d(new da.g() { // from class: ea.i
            @Override // da.g
            public final Object a(da.d dVar) {
                return ExecutorsRegistrar.o(dVar);
            }
        }).c());
    }
}
