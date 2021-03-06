package com.study.chapter01;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelId;
import io.netty.channel.ChannelMetadata;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelProgressivePromise;
import io.netty.channel.ChannelPromise;
import io.netty.channel.EventLoop;
import io.netty.channel.Channel.Unsafe;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;

/**
 * example 1.3
 */
public class AsynchronousConnection {
	public void getConnection() {
//		Channel channel = ...;
		Channel channel = new Channel() {
			
			@Override
			public int compareTo(Channel o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public ChannelFuture writeAndFlush(Object arg0, ChannelPromise arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture writeAndFlush(Object arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture write(Object arg0, ChannelPromise arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture write(Object arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelPromise voidPromise() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture newSucceededFuture() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelPromise newPromise() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelProgressivePromise newProgressivePromise() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture newFailedFuture(Throwable arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture disconnect(ChannelPromise arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture disconnect() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture deregister(ChannelPromise arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture deregister() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture connect(SocketAddress arg0, SocketAddress arg1, ChannelPromise arg2) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture connect(SocketAddress arg0, ChannelPromise arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture connect(SocketAddress arg0, SocketAddress arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture connect(SocketAddress arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture close(ChannelPromise arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture close() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture bind(SocketAddress arg0, ChannelPromise arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture bind(SocketAddress arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> boolean hasAttr(AttributeKey<T> arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public <T> Attribute<T> attr(AttributeKey<T> arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Unsafe unsafe() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public SocketAddress remoteAddress() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Channel read() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelPipeline pipeline() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Channel parent() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelMetadata metadata() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public SocketAddress localAddress() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isWritable() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isRegistered() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isOpen() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isActive() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public ChannelId id() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Channel flush() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public EventLoop eventLoop() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelConfig config() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ChannelFuture closeFuture() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long bytesBeforeWritable() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long bytesBeforeUnwritable() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public ByteBufAllocator alloc() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		ChannelFuture future = channel.connect(new InetSocketAddress("192.168.0.1", 25));
	}
}
