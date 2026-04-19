package xd;

import ae.r;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public final class n {
    public static final long a(Reader reader, Writer writer, int i10) throws IOException {
        r.f(reader, "<this>");
        r.f(writer, "out");
        char[] cArr = new char[i10];
        int i11 = reader.read(cArr);
        long j10 = 0;
        while (i11 >= 0) {
            writer.write(cArr, 0, i11);
            j10 += (long) i11;
            i11 = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(reader, writer, i10);
    }

    public static final ie.g<String> c(BufferedReader bufferedReader) {
        r.f(bufferedReader, "<this>");
        return ie.m.d(new l(bufferedReader));
    }

    public static final String d(Reader reader) {
        r.f(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        r.e(string, "toString(...)");
        return string;
    }
}
