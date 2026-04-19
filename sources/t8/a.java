package t8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f21303a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue f21304b = new LinkedBlockingQueue();

    @ResultIgnorabilityUnspecified
    public IBinder a() {
        w8.m.j("BlockingServiceConnection.getService() called on main thread");
        if (this.f21303a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f21303a = true;
        return (IBinder) this.f21304b.take();
    }

    @ResultIgnorabilityUnspecified
    public IBinder b(long j10, TimeUnit timeUnit) throws TimeoutException {
        w8.m.j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f21303a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f21303a = true;
        IBinder iBinder = (IBinder) this.f21304b.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f21304b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
