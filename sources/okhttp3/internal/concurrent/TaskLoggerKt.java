package okhttp3.internal.concurrent;

import ae.m0;
import ae.r;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class TaskLoggerKt {
    public static final String b(long j10) {
        StringBuilder sb2;
        long j11;
        long j12;
        long j13;
        if (j10 > -999500000) {
            if (j10 > -999500) {
                if (j10 <= 0) {
                    sb2 = new StringBuilder();
                    j13 = j10 - ((long) 500);
                } else if (j10 < 999500) {
                    sb2 = new StringBuilder();
                    j13 = j10 + ((long) 500);
                } else if (j10 < 999500000) {
                    sb2 = new StringBuilder();
                    j12 = j10 + ((long) 500000);
                } else {
                    sb2 = new StringBuilder();
                    j11 = j10 + ((long) 500000000);
                }
                sb2.append(j13 / ((long) 1000));
                sb2.append(" µs");
                String string = sb2.toString();
                m0 m0Var = m0.f720a;
                String str = String.format("%6s", Arrays.copyOf(new Object[]{string}, 1));
                r.e(str, "format(format, *args)");
                return str;
            }
            sb2 = new StringBuilder();
            j12 = j10 - ((long) 500000);
            sb2.append(j12 / ((long) UtilsKt.MICROS_MULTIPLIER));
            sb2.append(" ms");
            String string2 = sb2.toString();
            m0 m0Var2 = m0.f720a;
            String str2 = String.format("%6s", Arrays.copyOf(new Object[]{string2}, 1));
            r.e(str2, "format(format, *args)");
            return str2;
        }
        sb2 = new StringBuilder();
        j11 = j10 - ((long) 500000000);
        sb2.append(j11 / ((long) 1000000000));
        sb2.append(" s ");
        String string22 = sb2.toString();
        m0 m0Var22 = m0.f720a;
        String str22 = String.format("%6s", Arrays.copyOf(new Object[]{string22}, 1));
        r.e(str22, "format(format, *args)");
        return str22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Task task, TaskQueue taskQueue, String str) {
        Logger loggerA = TaskRunner.f17145h.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(taskQueue.f());
        sb2.append(' ');
        m0 m0Var = m0.f720a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        r.e(str2, "format(format, *args)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(task.b());
        loggerA.fine(sb2.toString());
    }
}
