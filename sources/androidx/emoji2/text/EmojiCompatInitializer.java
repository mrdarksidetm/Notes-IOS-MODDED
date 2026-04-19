package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.e;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements y4.a<Boolean> {

    class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.g f3785a;

        a(androidx.lifecycle.g gVar) {
            this.f3785a = gVar;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(o4.e eVar) {
            EmojiCompatInitializer.this.e();
            this.f3785a.c(this);
        }
    }

    static class b extends e.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    static class c implements e.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f3787a;

        class a extends e.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e.i f3788a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f3789b;

            a(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f3788a = iVar;
                this.f3789b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th) {
                try {
                    this.f3788a.a(th);
                } finally {
                    this.f3789b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.i
            public void b(l lVar) {
                try {
                    this.f3788a.b(lVar);
                } finally {
                    this.f3789b.shutdown();
                }
            }
        }

        c(Context context) {
            this.f3787a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.h
        public void a(final e.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3829a.d(iVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                i iVarA = androidx.emoji2.text.c.a(this.f3787a);
                if (iVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                iVarA.c(threadPoolExecutor);
                iVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k3.g.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.i()) {
                    e.c().l();
                }
            } finally {
                k3.g.b();
            }
        }
    }

    @Override // y4.a
    public List<Class<? extends y4.a<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // y4.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        e.h(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        androidx.lifecycle.g lifecycle = ((o4.e) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new a(lifecycle));
    }

    void e() {
        androidx.emoji2.text.b.d().postDelayed(new d(), 500L);
    }
}
