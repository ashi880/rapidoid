package org.rapidoidx.demo.taskplanner.model;

import org.rapidoid.annotation.Authors;
import org.rapidoid.annotation.DbEntity;
import org.rapidoid.annotation.Since;
import org.rapidoidx.db.DB;
import org.rapidoidx.db.DbRef;
import org.rapidoidx.db.DbSet;

/*
 * #%L
 * rapidoid-demo
 * %%
 * Copyright (C) 2014 - 2015 Nikolche Mihajlovski
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

@SuppressWarnings("serial")
@DbEntity
@Authors("Nikolche Mihajlovski")
@Since("2.0.0")
public class Comment extends Entity {

	public String content;

	public DbRef<User> owner = DB.ref(this, "^owns");

	public DbRef<Task> task = DB.ref(this, "^has");

	public DbSet<User> likedBy = DB.set(this, "^likes");

}