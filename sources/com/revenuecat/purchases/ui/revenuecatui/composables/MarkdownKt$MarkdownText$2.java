package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import androidx.compose.ui.e;
import b2.t1;
import e0.b0;
import i2.d;
import i2.d0;
import java.util.Iterator;
import k1.f;
import md.i0;
import md.u;
import sd.j;
import t0.k1;
import v1.k0;
import v1.p0;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class MarkdownKt$MarkdownText$2 extends s implements l<e, e> {
    final /* synthetic */ k1<d0> $layoutResult;
    final /* synthetic */ d $text;
    final /* synthetic */ t1 $uriHandler;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt$MarkdownText$2$1, reason: invalid class name */
    @sd.d(c = "com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt$MarkdownText$2$1", f = "Markdown.kt", l = {558}, m = "invokeSuspend")
    static final class AnonymousClass1 extends j implements p<k0, qd.d<? super i0>, Object> {
        final /* synthetic */ k1<d0> $layoutResult;
        final /* synthetic */ d $text;
        final /* synthetic */ t1 $uriHandler;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt$MarkdownText$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02091 extends s implements l<f, i0> {
            final /* synthetic */ k1<d0> $layoutResult;
            final /* synthetic */ d $text;
            final /* synthetic */ t1 $uriHandler;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02091(k1<d0> k1Var, d dVar, t1 t1Var) {
                super(1);
                this.$layoutResult = k1Var;
                this.$text = dVar;
                this.$uriHandler = t1Var;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(f fVar) {
                m176invokek4lQ0M(fVar.x());
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m176invokek4lQ0M(long j10) {
                Object next;
                d0 value = this.$layoutResult.getValue();
                if (value != null) {
                    d dVar = this.$text;
                    t1 t1Var = this.$uriHandler;
                    int iW = value.w(j10);
                    Iterator<T> it = dVar.h(iW, iW).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (r.b(((d.b) next).g(), "url")) {
                                break;
                            }
                        }
                    }
                    d.b bVar = (d.b) next;
                    if (bVar != null) {
                        t1Var.a((String) bVar.e());
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(k1<d0> k1Var, d dVar, t1 t1Var, qd.d<? super AnonymousClass1> dVar2) {
            super(2, dVar2);
            this.$layoutResult = k1Var;
            this.$text = dVar;
            this.$uriHandler = t1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$layoutResult, this.$text, this.$uriHandler, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // zd.p
        public final Object invoke(k0 k0Var, qd.d<? super i0> dVar) {
            return ((AnonymousClass1) create(k0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.label;
            if (i10 == 0) {
                u.b(obj);
                k0 k0Var = (k0) this.L$0;
                C02091 c02091 = new C02091(this.$layoutResult, this.$text, this.$uriHandler);
                this.label = 1;
                if (b0.j(k0Var, null, null, null, c02091, this, 7, null) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f15558a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarkdownKt$MarkdownText$2(k1<d0> k1Var, d dVar, t1 t1Var) {
        super(1);
        this.$layoutResult = k1Var;
        this.$text = dVar;
        this.$uriHandler = t1Var;
    }

    @Override // zd.l
    public final e invoke(e eVar) {
        r.f(eVar, "$this$conditional");
        return p0.d(eVar, i0.f15558a, new AnonymousClass1(this.$layoutResult, this.$text, this.$uriHandler, null));
    }
}
