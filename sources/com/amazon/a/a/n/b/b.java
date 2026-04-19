package com.amazon.a.a.n.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7392a = new com.amazon.a.a.o.c("SimpleTaskPipeline");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f7393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<Runnable> f7394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7395d;

    private b(HandlerThread handlerThread) {
        this.f7394c = Collections.synchronizedSet(new HashSet());
        this.f7395d = handlerThread.getName();
        handlerThread.start();
        this.f7393b = new Handler(handlerThread.getLooper());
    }

    private b(String str) {
        this.f7394c = Collections.synchronizedSet(new HashSet());
        this.f7395d = str;
        this.f7393b = new Handler();
    }

    private long a(Date date) {
        return SystemClock.uptimeMillis() + (date.getTime() - System.currentTimeMillis());
    }

    public static b a(String str) {
        return new b(new HandlerThread("KIWI_" + str));
    }

    public static b b(String str) {
        return new b(str);
    }

    private Runnable c(final com.amazon.a.a.n.a aVar) {
        Runnable runnable = new Runnable() { // from class: com.amazon.a.a.n.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                com.amazon.a.a.o.c cVar;
                StringBuilder sb2;
                b.this.f7394c.remove(this);
                try {
                    if (com.amazon.a.a.o.c.f7483a) {
                        b.f7392a.a(b.this.f7395d + ": Executing Task: " + aVar + ", current time: " + new Date() + ", uptime: " + SystemClock.uptimeMillis());
                    }
                    aVar.a();
                } catch (Throwable th) {
                    try {
                        if (com.amazon.a.a.o.c.f7484b) {
                            b.f7392a.b("Task Failed with unhandled exception: " + th, th);
                        }
                        if (!com.amazon.a.a.o.c.f7483a) {
                            return;
                        }
                        cVar = b.f7392a;
                        sb2 = new StringBuilder();
                    } catch (Throwable th2) {
                        if (com.amazon.a.a.o.c.f7483a) {
                            b.f7392a.a(b.this.f7395d + ": Task finished executing: " + aVar);
                        }
                        throw th2;
                    }
                }
                if (com.amazon.a.a.o.c.f7483a) {
                    cVar = b.f7392a;
                    sb2 = new StringBuilder();
                    sb2.append(b.this.f7395d);
                    sb2.append(": Task finished executing: ");
                    sb2.append(aVar);
                    cVar.a(sb2.toString());
                }
            }

            public String toString() {
                return aVar.toString();
            }
        };
        this.f7394c.add(runnable);
        return runnable;
    }

    @Override // com.amazon.a.a.n.b.c
    public void a() {
        for (Runnable runnable : this.f7394c) {
            if (com.amazon.a.a.o.c.f7483a) {
                f7392a.a(this.f7395d + ": Removing callback: " + runnable);
            }
            this.f7393b.removeCallbacks(runnable);
        }
        this.f7394c.clear();
        if (this.f7393b.getLooper() == Looper.getMainLooper() || !this.f7393b.getLooper().getThread().isAlive()) {
            return;
        }
        com.amazon.a.a.o.c cVar = f7392a;
        cVar.a("Interrupting looper thread!");
        this.f7393b.getLooper().getThread().interrupt();
        cVar.a("Quitting looper: " + this.f7393b.getLooper().getThread() + ", " + this.f7393b.getLooper().getThread().isAlive());
        this.f7393b.getLooper().quit();
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.f7483a) {
            f7392a.a("Scheduling task: " + aVar);
        }
        this.f7393b.post(c(aVar));
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, long j10) {
        if (com.amazon.a.a.o.c.f7483a) {
            f7392a.a(this.f7395d + ": Scheduling task: " + aVar + ", with delay: " + j10);
        }
        this.f7393b.postDelayed(c(aVar), j10);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, Date date) {
        long jA = a(date);
        if (com.amazon.a.a.o.c.f7483a) {
            f7392a.a(this.f7395d + ": Scheduling task: " + aVar + ", at time: " + date + ", System uptimeMillis: " + System.currentTimeMillis() + ", uptimeMillis: " + jA);
        }
        this.f7393b.postAtTime(c(aVar), jA);
    }

    @Override // com.amazon.a.a.n.b.c
    public void b(com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.f7483a) {
            f7392a.a(this.f7395d + ": Scheduling task immediately: " + aVar);
        }
        this.f7393b.postAtFrontOfQueue(c(aVar));
    }
}
