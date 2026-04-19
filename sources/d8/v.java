package d8;

import f8.b;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f9839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e8.d f9840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f9841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f8.b f9842d;

    v(Executor executor, e8.d dVar, x xVar, f8.b bVar) {
        this.f9839a = executor;
        this.f9840b = dVar;
        this.f9841c = xVar;
        this.f9842d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator<w7.o> it = this.f9840b.r().iterator();
        while (it.hasNext()) {
            this.f9841c.a(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f9842d.a(new b.a() { // from class: d8.u
            @Override // f8.b.a
            public final Object a() {
                return this.f9838a.d();
            }
        });
    }

    public void c() {
        this.f9839a.execute(new Runnable() { // from class: d8.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f9837a.e();
            }
        });
    }
}
