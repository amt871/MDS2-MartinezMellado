import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-mis_seguidores_item';

@customElement('vista-mis_seguidores')
export class VistaMis_seguidores extends LitElement {
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
 <vaadin-scroller style="width: 100%; height: 100%;">
  <vista-mis_seguidores_item style="width: 100%; height: 20%;"></vista-mis_seguidores_item>
  <vista-mis_seguidores_item style="width: 100%; height: 20%;"></vista-mis_seguidores_item>
  <vista-mis_seguidores_item style="width: 100%; height: 20%;"></vista-mis_seguidores_item>
  <vista-mis_seguidores_item style="width: 100%; height: 20%;"></vista-mis_seguidores_item>
  <vista-mis_seguidores_item style="width: 100%; height: 20%;"></vista-mis_seguidores_item>
  <vista-mis_seguidores_item style="width: 100%; height: 20%;"></vista-mis_seguidores_item>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
