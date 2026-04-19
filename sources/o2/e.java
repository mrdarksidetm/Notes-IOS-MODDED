package o2;

import n2.i0;
import n2.s;
import o2.c;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final s a(c cVar, c.a aVar, i0 i0Var, int i10) {
        return new d(cVar.b(), aVar, i0Var, i10, cVar.a(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(int i10) {
        return i10 != -4 ? i10 != -3 ? i10 != -2 ? i10 != -1 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "Unknown error code" : "The given query was not supported by this provider." : "The provider found the queried font, but it is currently unavailable." : "Font not found, please check availability on GoogleFont.Provider.AllFontsList: https://fonts.gstatic.com/s/a/directory.xml" : "The requested provider was not found on this device." : "The given provider cannot be authenticated with the certificates given." : "Generic error loading font, for example variation settings were not parsable" : "Font was not loaded due to security issues. This usually means the font was attempted to load in a restricted context";
    }
}
