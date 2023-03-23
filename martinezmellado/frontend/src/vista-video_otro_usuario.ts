import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-mi_cabecera';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-video_otro_usuario_item';

@customElement('vista-video_otro_usuario')
export class VistaVideo_otro_usuario extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vista-mi_cabecera style="width: 100%; height: 5%;"></vista-mi_cabecera>
 <vaadin-scroller style="width: 100%; height: 100%;">
  <vista-video_otro_usuario_item style="width: 100%; height: 100%; padding-top: var(--lumo-space-xl);"></vista-video_otro_usuario_item>
  <vista-video_otro_usuario_item style="padding-top: var(--lumo-space-xl);"></vista-video_otro_usuario_item>
  <vista-video_otro_usuario_item style="padding-top: var(--lumo-space-xl);"></vista-video_otro_usuario_item>
  <vista-video_otro_usuario_item style="padding-top: var(--lumo-space-xl);"></vista-video_otro_usuario_item>
  <vista-video_otro_usuario_item style="padding-top: var(--lumo-space-xl);"></vista-video_otro_usuario_item>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
