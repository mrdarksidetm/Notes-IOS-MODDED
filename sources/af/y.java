package af;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public final class y {
    public static final <T extends Enum<T>> we.b<T> a(String str, T[] tArr, String[] strArr, Annotation[][] annotationArr, Annotation[] annotationArr2) {
        ae.r.f(str, "serialName");
        ae.r.f(tArr, "values");
        ae.r.f(strArr, "names");
        ae.r.f(annotationArr, "entryAnnotations");
        w wVar = new w(str, tArr.length);
        if (annotationArr2 != null) {
            for (Annotation annotation : annotationArr2) {
                wVar.s(annotation);
            }
        }
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = tArr[i10];
            int i12 = i11 + 1;
            String strName = (String) nd.p.R(strArr, i11);
            if (strName == null) {
                strName = t10.name();
            }
            a1.m(wVar, strName, false, 2, null);
            Annotation[] annotationArr3 = (Annotation[]) nd.p.R(annotationArr, i11);
            if (annotationArr3 != null) {
                for (Annotation annotation2 : annotationArr3) {
                    wVar.r(annotation2);
                }
            }
            i10++;
            i11 = i12;
        }
        return new x(str, tArr, wVar);
    }

    public static final <T extends Enum<T>> we.b<T> b(String str, T[] tArr) {
        ae.r.f(str, "serialName");
        ae.r.f(tArr, "values");
        return new x(str, tArr);
    }
}
