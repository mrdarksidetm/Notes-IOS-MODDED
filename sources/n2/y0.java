package n2;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import n2.h0;

/* JADX INFO: loaded from: classes.dex */
final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f15905a = new y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal<Paint> f15906b = new ThreadLocal<>();

    static final class a extends ae.s implements zd.l<h0.a, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w2.d f15907a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w2.d dVar) {
            super(1);
            this.f15907a = dVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(h0.a aVar) {
            return '\'' + aVar.c() + "' " + aVar.b(this.f15907a);
        }
    }

    private y0() {
    }

    private final String b(h0.d dVar, Context context) {
        return y2.a.d(dVar.b(), null, null, null, 0, null, new a(w2.a.a(context)), 31, null);
    }

    public final Typeface a(Typeface typeface, h0.d dVar, Context context) {
        if (typeface == null) {
            return null;
        }
        if (dVar.b().isEmpty()) {
            return typeface;
        }
        Paint paint = f15906b.get();
        if (paint == null) {
            paint = new Paint();
            f15906b.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(b(dVar, context));
        return paint.getTypeface();
    }
}
