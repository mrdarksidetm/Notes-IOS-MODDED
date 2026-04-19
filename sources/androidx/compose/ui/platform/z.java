package androidx.compose.ui.platform;

import android.view.View;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public interface z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3110a = a.f3111a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f3111a = new a();

        private a() {
        }

        public final z a() {
            return b.f3112b;
        }
    }

    public static final class b implements z {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f3112b = new b();

        static final class a extends ae.s implements zd.a<i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f3113a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0065b f3114b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ x3.b f3115c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.platform.a aVar, ViewOnAttachStateChangeListenerC0065b viewOnAttachStateChangeListenerC0065b, x3.b bVar) {
                super(0);
                this.f3113a = aVar;
                this.f3114b = viewOnAttachStateChangeListenerC0065b;
                this.f3115c = bVar;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f3113a.removeOnAttachStateChangeListener(this.f3114b);
                x3.a.e(this.f3113a, this.f3115c);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.z$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC0065b implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f3116a;

            ViewOnAttachStateChangeListenerC0065b(androidx.compose.ui.platform.a aVar) {
                this.f3116a = aVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (x3.a.d(this.f3116a)) {
                    return;
                }
                this.f3116a.disposeComposition();
            }
        }

        private b() {
        }

        @Override // androidx.compose.ui.platform.z
        public zd.a<i0> a(final androidx.compose.ui.platform.a aVar) {
            ViewOnAttachStateChangeListenerC0065b viewOnAttachStateChangeListenerC0065b = new ViewOnAttachStateChangeListenerC0065b(aVar);
            aVar.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0065b);
            x3.b bVar = new x3.b() { // from class: b2.w1
            };
            x3.a.a(aVar, bVar);
            return new a(aVar, viewOnAttachStateChangeListenerC0065b, bVar);
        }
    }

    zd.a<i0> a(androidx.compose.ui.platform.a aVar);
}
