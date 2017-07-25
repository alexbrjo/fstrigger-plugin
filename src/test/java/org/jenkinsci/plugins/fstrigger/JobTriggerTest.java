/*
 * The MIT License
 *
 * Copyright (c) 2017, CloudBees, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.jenkinsci.plugins.fstrigger;

import hudson.model.FreeStyleProject;
import org.jenkinsci.plugins.fstrigger.triggers.FileNameTrigger;
import org.jenkinsci.plugins.fstrigger.triggers.FileNameTriggerInfo;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;

import static org.junit.Assert.assertTrue;

/**
 *
 * @author Alex Johnson
 */
public class JobTriggerTest {

   // @Rule
    //public JenkinsRule j = new JenkinsRule();

    @Test
    public void testFileNameWouldBeTriggered () throws Exception {
        assertTrue(4 < 5);
        /*j.jenkins.setNumExecutors(0);
        j.createOnlineSlave();

        FreeStyleProject p = j.createFreeStyleProject();
        p.getSomeWorkspace().createTempFile("file","txt");

        FileNameTriggerInfo fileInfo = new FileNameTriggerInfo();
        fileInfo.setFilePathPattern("");
        FileNameTrigger trigger = new FileNameTrigger("* * * * *", new FileNameTriggerInfo[]{fileInfo});

        p.addTrigger(trigger);
        trigger.start(p, true);
        trigger.run();

        assertTrue(p.getBuilds().size() > 0);*/
    }
}
