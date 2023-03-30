import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-resultado_busqueda_hastag_item';

@customElement('vista-resultado_busqueda_hastag')
export class VistaResultado_busqueda_hastag extends LitElement {
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
 <vaadin-scroller style="height: 100%; width: 100%;">
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
  <vista-resultado_busqueda_hastag_item style="height: 5%;"></vista-resultado_busqueda_hastag_item>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
