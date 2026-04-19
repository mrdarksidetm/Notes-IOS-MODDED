package androidx.compose.ui.platform;

import a2.r0;
import android.view.DragEvent;
import android.view.View;
import java.util.Iterator;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
final class DragAndDropModifierOnDragListener implements View.OnDragListener, h1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.q<h1.h, k1.l, zd.l<? super n1.f, i0>, Boolean> f2844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h1.e f2845b = new h1.e(a.f2848a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z.b<h1.d> f2846c = new z.b<>(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.compose.ui.e f2847d = new r0<h1.e>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // a2.r0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public h1.e a() {
            return this.f2849b.f2845b;
        }

        @Override // a2.r0
        public int hashCode() {
            return this.f2849b.f2845b.hashCode();
        }

        @Override // a2.r0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void c(h1.e eVar) {
        }
    };

    static final class a extends ae.s implements zd.l<h1.b, h1.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2848a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h1.g invoke(h1.b bVar) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropModifierOnDragListener(zd.q<? super h1.h, ? super k1.l, ? super zd.l<? super n1.f, i0>, Boolean> qVar) {
        this.f2844a = qVar;
    }

    @Override // h1.c
    public void a(h1.d dVar) {
        this.f2846c.add(dVar);
    }

    @Override // h1.c
    public boolean b(h1.d dVar) {
        return this.f2846c.contains(dVar);
    }

    public androidx.compose.ui.e d() {
        return this.f2847d;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent dragEvent) {
        h1.b bVar = new h1.b(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean zA2 = this.f2845b.a2(bVar);
                Iterator<h1.d> it = this.f2846c.iterator();
                while (it.hasNext()) {
                    it.next().c1(bVar);
                }
                break;
            case 2:
                this.f2845b.W(bVar);
                break;
            case 4:
                this.f2845b.Y(bVar);
                break;
            case 5:
                this.f2845b.t1(bVar);
                break;
            case 6:
                this.f2845b.A0(bVar);
                break;
        }
        return false;
    }
}
