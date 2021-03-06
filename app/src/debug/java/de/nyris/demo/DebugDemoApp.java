/*
 * Copyright (C) 2017 nyris GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.nyris.demo;

import android.app.Application;
import com.facebook.stetho.Stetho;

import de.nyris.imx.Nyris;
import de.nyris.imx.NyrisEndpoints;

public class DebugDemoApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        NyrisEndpoints.DEBUG = BuildConfig.DEBUG;
        Stetho.initializeWithDefaults(this);
        Nyris.getInstance()
                .init(this, BuildConfig.CLIENT_ID)
                //You can add your own output format
                /*.setOutputformat("YOUR_OUTPUT_FORMAT")*/;
    }
}
