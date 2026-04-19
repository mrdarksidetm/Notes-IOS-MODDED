package o6;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final Drawable a(Context context, int i10) {
        Drawable drawableB = l.a.b(context, i10);
        if (drawableB != null) {
            return drawableB;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final Drawable b(Resources resources, int i10, Resources.Theme theme) {
        Drawable drawableD = androidx.core.content.res.b.d(resources, i10, theme);
        if (drawableD != null) {
            return drawableD;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final androidx.lifecycle.g c(Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof o4.e)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((o4.e) baseContext).getLifecycle();
    }

    public static final Drawable d(Context context, Resources resources, int i10) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, i10, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final boolean e(Context context, String str) {
        return androidx.core.content.a.checkSelfPermission(context, str) == 0;
    }
}
