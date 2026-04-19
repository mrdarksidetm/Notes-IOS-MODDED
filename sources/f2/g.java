package f2;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import f2.b;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p1.d;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final b.a a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i10) throws XmlPullParserException, IOException {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        q1.a aVar = new q1.a(xmlResourceParser, 0, 2, null);
        d.a aVarA = q1.c.a(aVar, resources, theme, attributeSetAsAttributeSet);
        int iG = 0;
        while (!q1.c.d(xmlResourceParser)) {
            iG = q1.c.g(aVar, resources, attributeSetAsAttributeSet, theme, aVarA, iG);
            xmlResourceParser.next();
        }
        return new b.a(aVarA.f(), i10);
    }
}
