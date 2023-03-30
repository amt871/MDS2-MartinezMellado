import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-resultado_busqueda_usuarios_item';

@customElement('vista-resultado_busqueda_usuarios')
export class VistaResultado_busqueda_usuarios extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 1; flex-grow: 0; height: 100%;">
  <vaadin-vertical-layout style="width: 100%;">
   <vaadin-scroller style="width: 100%; height: 100%;">
    <vista-resultado_busqueda_usuarios_item style="height: 20%;"></vista-resultado_busqueda_usuarios_item>
    <vista-resultado_busqueda_usuarios_item style="height: 20%;"></vista-resultado_busqueda_usuarios_item>
    <vista-resultado_busqueda_usuarios_item style="height: 20%;"></vista-resultado_busqueda_usuarios_item>
    <vista-resultado_busqueda_usuarios_item style="height: 20%;"></vista-resultado_busqueda_usuarios_item>
    <vista-resultado_busqueda_usuarios_item style="height: 20%;"></vista-resultado_busqueda_usuarios_item>
    <vista-resultado_busqueda_usuarios_item style="height: 20%;"></vista-resultado_busqueda_usuarios_item>
    <vista-resultado_busqueda_usuarios_item style="height: 20%;"></vista-resultado_busqueda_usuarios_item>
    <vista-resultado_busqueda_usuarios_item style="height: 20%;"></vista-resultado_busqueda_usuarios_item>
    <vista-resultado_busqueda_usuarios_item style="height: 20%;"></vista-resultado_busqueda_usuarios_item>
   </vaadin-scroller>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
