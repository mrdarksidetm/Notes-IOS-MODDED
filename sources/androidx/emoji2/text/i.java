package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.e;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import l3.g;

/* JADX INFO: loaded from: classes.dex */
public class i extends e.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f3848k = new a();

    public static class a {
        public Typeface a(Context context, g.b bVar) {
            return l3.g.a(context, null, new g.b[]{bVar});
        }

        public g.a b(Context context, l3.e eVar) {
            return l3.g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements e.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f3849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l3.e f3850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f3851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f3852d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Handler f3853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Executor f3854f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f3855g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e.i f3856h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ContentObserver f3857i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f3858j;

        b(Context context, l3.e eVar, a aVar) {
            n3.g.i(context, "Context cannot be null");
            n3.g.i(eVar, "FontRequest cannot be null");
            this.f3849a = context.getApplicationContext();
            this.f3850b = eVar;
            this.f3851c = aVar;
        }

        private void b() {
            synchronized (this.f3852d) {
                this.f3856h = null;
                ContentObserver contentObserver = this.f3857i;
                if (contentObserver != null) {
                    this.f3851c.c(this.f3849a, contentObserver);
                    this.f3857i = null;
                }
                Handler handler = this.f3853e;
                if (handler != null) {
                    handler.removeCallbacks(this.f3858j);
                }
                this.f3853e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f3855g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f3854f = null;
                this.f3855g = null;
            }
        }

        private g.b e() {
            try {
                g.a aVarB = this.f3851c.b(this.f3849a, this.f3850b);
                if (aVarB.c() == 0) {
                    g.b[] bVarArrB = aVarB.b();
                    if (bVarArrB == null || bVarArrB.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrB[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.c() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.e.h
        public void a(e.i iVar) {
            n3.g.i(iVar, "LoaderCallback cannot be null");
            synchronized (this.f3852d) {
                this.f3856h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f3852d) {
                if (this.f3856h == null) {
                    return;
                }
                try {
                    g.b bVarE = e();
                    int iB = bVarE.b();
                    if (iB == 2) {
                        synchronized (this.f3852d) {
                        }
                    }
                    if (iB != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                    }
                    try {
                        k3.g.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Typeface typefaceA = this.f3851c.a(this.f3849a, bVarE);
                        ByteBuffer byteBufferF = g3.i.f(this.f3849a, null, bVarE.d());
                        if (byteBufferF == null || typefaceA == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        l lVarB = l.b(typefaceA, byteBufferF);
                        k3.g.b();
                        synchronized (this.f3852d) {
                            e.i iVar = this.f3856h;
                            if (iVar != null) {
                                iVar.b(lVarB);
                            }
                        }
                        b();
                    } catch (Throwable th) {
                        k3.g.b();
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (this.f3852d) {
                        e.i iVar2 = this.f3856h;
                        if (iVar2 != null) {
                            iVar2.a(th2);
                        }
                        b();
                    }
                }
            }
        }

        void d() {
            synchronized (this.f3852d) {
                if (this.f3856h == null) {
                    return;
                }
                if (this.f3854f == null) {
                    ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("emojiCompat");
                    this.f3855g = threadPoolExecutorB;
                    this.f3854f = threadPoolExecutorB;
                }
                this.f3854f.execute(new Runnable() { // from class: androidx.emoji2.text.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3859a.c();
                    }
                });
            }
        }

        public void f(Executor executor) {
            synchronized (this.f3852d) {
                this.f3854f = executor;
            }
        }
    }

    public i(Context context, l3.e eVar) {
        super(new b(context, eVar, f3848k));
    }

    public i c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
