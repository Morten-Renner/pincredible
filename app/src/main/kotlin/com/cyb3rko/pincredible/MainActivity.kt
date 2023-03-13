/*
 * Copyright (c) 2023 Cyb3rKo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cyb3rko.pincredible

import android.os.Bundle
import androidx.navigation.findNavController
import com.cyb3rko.backpack.activities.BackpackMainActivity
import com.cyb3rko.pincredible.databinding.ActivityMainBinding

class MainActivity : BackpackMainActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.setDefaultUncaughtExceptionHandler(ExceptionHandler(this))

        binding = ActivityMainBinding.inflate(layoutInflater).asContentView()
        setSupportActionBar(binding.toolbar)
        findNavController(R.id.nav_host_fragment_content_main).applyToActionBar()
    }
}
