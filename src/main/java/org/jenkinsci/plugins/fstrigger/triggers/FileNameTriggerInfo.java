package org.jenkinsci.plugins.fstrigger.triggers;

import hudson.Extension;
import hudson.FilePath;
import hudson.model.Describable;
import hudson.model.Descriptor;
import jenkins.model.Jenkins;
import org.jenkinsci.Symbol;
import org.jenkinsci.plugins.fstrigger.core.FSTriggerContentFileType;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Gregory Boissinot
 */
public class FileNameTriggerInfo implements Serializable, Describable<FileNameTriggerInfo> {

    private static final long serialVersionUID = 1L;

    private String filePathPattern;

    private String strategy;

    private boolean inspectingContentFile;

    private boolean doNotCheckLastModificationDate;

    private FSTriggerContentFileType[] contentFileTypes;

    private transient FilePath resolvedFile;
    private transient long lastModifications;

    @DataBoundConstructor
    public FileNameTriggerInfo () {}

    /*
     * Getters and setters
     */

    @SuppressWarnings("unused")
    public String getFilePathPattern() {
        return filePathPattern;
    }

    @SuppressWarnings("unused")
    public String getStrategy() {
        return strategy;
    }

    @SuppressWarnings("unused")
    public boolean isInspectingContentFile() {
        return inspectingContentFile;
    }

    @SuppressWarnings("unused")
    public FSTriggerContentFileType[] getContentFileTypes() {
        return Arrays.copyOf(contentFileTypes, contentFileTypes.length);
    }

    @SuppressWarnings("unused")
    public boolean isDoNotCheckLastModificationDate() {
        return doNotCheckLastModificationDate;
    }

    @DataBoundSetter
    public void setFilePathPattern(String filePathPattern) {
        this.filePathPattern = filePathPattern;
    }

    @DataBoundSetter
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    @DataBoundSetter
    public void setInspectingContentFile(boolean inspectingContentFile) {
        this.inspectingContentFile = inspectingContentFile;
    }

    @DataBoundSetter
    public void setContentFileTypes(FSTriggerContentFileType[] contentFileTypes) {
        this.contentFileTypes = Arrays.copyOf(contentFileTypes, contentFileTypes.length);
    }

    @DataBoundSetter
    public void setDoNotCheckLastModificationDate(boolean doNotCheckLastModificationDate) {
        this.doNotCheckLastModificationDate = doNotCheckLastModificationDate;
    }

    public FilePath getResolvedFile() {
        return resolvedFile;
    }

    @DataBoundSetter
    public void setResolvedFile(FilePath resolvedFile) {
        this.resolvedFile = resolvedFile;
    }

    public long getLastModifications() {
        return lastModifications;
    }

    @DataBoundSetter
    public void setLastModifications(long lastModifications) {
        this.lastModifications = lastModifications;
    }

    @Override
    public Descriptor<FileNameTriggerInfo> getDescriptor() {
        return Jenkins.getActiveInstance().getDescriptorOrDie(getClass());
    }

    @Extension
    @Symbol("fileNameInfo")
    public static class DescriptorImpl extends Descriptor<FileNameTriggerInfo> {

        @Override
        public String getDisplayName() {
            return "File name trigger info";
        }
    }
}
