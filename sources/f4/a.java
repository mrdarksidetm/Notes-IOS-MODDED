package f4;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f11119a;

    a(a aVar) {
        this.f11119a = aVar;
    }

    public static a b(Context context, Uri uri) {
        return new c(null, context, uri);
    }

    public static a c(Context context, Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(context, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        return new d(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId));
    }

    public abstract a a(String str, String str2);

    public abstract Uri d();

    public abstract long e();
}
