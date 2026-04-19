package f2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.platform.r;
import f2.b;
import java.io.IOException;
import je.w;
import l1.v0;
import org.xmlpull.v1.XmlPullParserException;
import t0.l;
import t0.o;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final v0 b(CharSequence charSequence, Resources resources, int i10) {
        try {
            return a.a(v0.f14618a, resources, i10);
        } catch (Exception e10) {
            throw new d("Error attempting to load resource: " + ((Object) charSequence), e10);
        }
    }

    private static final p1.d c(Resources.Theme theme, Resources resources, int i10, int i11, l lVar, int i12) throws XmlPullParserException, IOException {
        lVar.e(21855625);
        if (o.I()) {
            o.U(21855625, i12, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:86)");
        }
        b bVar = (b) lVar.P(r.h());
        b.C0267b c0267b = new b.C0267b(theme, i10);
        b.a aVarB = bVar.b(c0267b);
        if (aVarB == null) {
            XmlResourceParser xml = resources.getXml(i10);
            if (!ae.r.b(q1.c.j(xml).getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            aVarB = g.a(theme, resources, xml, i11);
            bVar.d(c0267b, aVarB);
        }
        p1.d dVarB = aVarB.b();
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return dVarB;
    }

    public static final o1.c d(int i10, l lVar, int i11) {
        o1.c aVar;
        lVar.e(473971343);
        if (o.I()) {
            o.U(473971343, i11, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) lVar.P(r.g());
        Resources resourcesA = e.a(lVar, 0);
        lVar.e(-492369756);
        Object objF = lVar.f();
        l.a aVar2 = l.f20813a;
        if (objF == aVar2.a()) {
            objF = new TypedValue();
            lVar.E(objF);
        }
        lVar.K();
        TypedValue typedValue = (TypedValue) objF;
        resourcesA.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && w.P(charSequence, ".xml", false, 2, null)) {
            lVar.e(-738265327);
            aVar = p1.r.g(c(context.getTheme(), resourcesA, i10, typedValue.changingConfigurations, lVar, ((i11 << 6) & 896) | 72), lVar, 0);
        } else {
            lVar.e(-738265172);
            Object objValueOf = Integer.valueOf(i10);
            Object theme = context.getTheme();
            lVar.e(1618982084);
            boolean zN = lVar.N(objValueOf) | lVar.N(charSequence) | lVar.N(theme);
            Object objF2 = lVar.f();
            if (zN || objF2 == aVar2.a()) {
                objF2 = b(charSequence, resourcesA, i10);
                lVar.E(objF2);
            }
            lVar.K();
            aVar = new o1.a((v0) objF2, 0L, 0L, 6, null);
        }
        lVar.K();
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return aVar;
    }
}
